
                    /*******************************************/    NOT FOR LAB    /*******************************************/

import java.util.Scanner;
import java.io.*;

public class FileReader_Writer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            File f = new File("sample.txt");
            if (f.exists()) {
                System.out.println(f.getName() +" File already exists");
            } else {
                f.createNewFile();
                System.out.println(f.getName() + " File created successfully");
            }
            System.out.println("Enter the content to insert into file: ");
            String s = sc.nextLine();

            FileWriter fin = new FileWriter(f);
            fin.write(s);
            System.out.println("Content entered successfully into sample.txt");
            fin.close();

            File f1 = new File("new-sample.txt");
            if (f1.exists()) {
                System.out.println(f1.getName() +" File already exists");
            } else {
                f1.createNewFile();
                System.out.println(f1.getName() + " File created successfully");
            }

            FileReader f2 = new FileReader("sample.txt");
            char[] content = new char[100];
            f2.read(content);
            f2.close();
            System.out.println("Content of " + f.getName() + " is: ");
            System.out.println(content);

            FileWriter f3 = new FileWriter("new-sample.txt");
            f3.write(content);
            f3.close();
            System.out.println("Content of " + f.getName() + " copied to " + f1.getName() + " successfully");

            FileReader f4 = new FileReader("new-sample.txt");
            BufferedReader br = new BufferedReader(f4);

            String c;
            System.out.println("Content of " + f1.getName() + " is: ");

            while ((c = br.readLine()) != null) {
                System.out.print(c);
            }

            sc.close();
            f4.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
