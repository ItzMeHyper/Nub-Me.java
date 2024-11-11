/*Create 3 files, file1 odd numbers,  file 2 even numbers, file 3 merge (file1 and file 2)*/

 import java.io.*;

 class EvenPrinter extends Thread {
     public void run() {
         try {
             File EvnFile = new File("EVEN.txt");
             EvnFile.createNewFile();
             FileWriter fEvn = new FileWriter("EVEN.txt");
             for (int i = 0; i <= 100; i++) {
                 if (i % 2 == 0) {
                     fEvn.write(i + "\n");
                 }
             }
             fEvn.close();
         } catch (IOException e) {
             System.out.println("Exception occured: " + e.getMessage());
         }
     }
 }
 
 class OddPrinter extends Thread {
     public void run() {
         try {
             File OddFile = new File("ODD.txt");
             OddFile.createNewFile();
             FileWriter fOdd = new FileWriter("ODD.txt");
             for (int i = 0; i <= 100; i++) {
                 if (i % 2 != 0) {
                     fOdd.write(i + "\n");
                 }
             }
             fOdd.close();
         } catch (IOException e) {
             System.out.println("Exception occured: " + e.getMessage());
         }
     }
 }
 
 public class FileMerge {
     public static void main(String[] args) {
         Thread evenThread = new EvenPrinter();
         Thread oddThread = new OddPrinter();
 
         evenThread.start();
         oddThread.start();
 
         try {
             evenThread.join();
             oddThread.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         try{
            FileWriter mrg = new FileWriter("Merged.txt");

            FileReader fEvn = new FileReader("EVEN.txt");

            BufferedReader EVN = new BufferedReader(fEvn);
            String line;
            while((line = EVN.readLine()) != null){
                mrg.write(line+ "\n");
            }
            EVN.close();

            FileReader fOdd= new FileReader("ODD.txt");

            BufferedReader OD = new BufferedReader(fOdd);
            while((line = OD.readLine()) != null){
                mrg.write(line+ "\n");
            }
            OD.close();
            mrg.close();

         } catch (IOException e){
            System.out.println("Error: " +e.getMessage());
         }
 
         System.out.println("Finished printing odd and even numbers.");
     }
 }
 
