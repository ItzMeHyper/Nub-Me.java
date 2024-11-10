/*
 * Write a Java program to create two threads, one for writing odd numbers 
 * and another for writing even numbers up to 100 into two different files.
 */

import java.io.*;

class EvenNumberPrinter extends Thread {
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

class OddNumberPrinter extends Thread {
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

public class OddEvenFileThread {
    public static void main(String[] args) {
        Thread evenThread = new EvenNumberPrinter();
        Thread oddThread = new OddNumberPrinter();

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finished printing odd and even numbers.");
    }
}
