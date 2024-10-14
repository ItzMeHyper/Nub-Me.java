import java.util.*;
import java.io.*;

public class FileOdd_Even {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            File obj1 = new File("number.txt");
            obj1.createNewFile();
            System.out.println("number.txt created\n");
            File obj2 = new File("even.txt");
            obj2.createNewFile();
            System.out.println("even.txt created\n");
            File obj3 = new File("odd.txt");
            obj3.createNewFile();
            System.out.println("odd.txt created\n");

            FileWriter fout = new FileWriter("number.txt");
            System.out.print("Enter the number of elements you want to store: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                fout.write(num + "\n");
            }
            fout.close();
            System.out.println("Data added");

            FileReader fin = new FileReader("number.txt");
            BufferedReader br1 = new BufferedReader(fin);
            String line;
            System.out.println("\nContent of number.txt is:");
            while ((line = br1.readLine()) != null) {
                System.out.print(line+ " ");
            }
            br1.close();

            BufferedReader br2 = new BufferedReader(new FileReader("number.txt"));
            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");
            while ((line = br2.readLine()) != null) {
                try {
                    int num = Integer.parseInt(line.trim());
                    if (num % 2 == 0) {
                        evenWriter.write(num + "\n");
                    } else {
                        oddWriter.write(num + "\n");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number: " + line);
                }
            }
            br2.close();
            evenWriter.close();
            oddWriter.close();
            System.out.println("\nEven and odd numbers have been separated into even.txt and odd.txt");

            System.out.println("\nContent of even.txt:");
            try {
                BufferedReader br = new BufferedReader(new FileReader("even.txt"));

                while ((line = br.readLine()) != null) {
                    System.out.print(line+ " ");
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
            System.out.println("\nContent of odd.txt:");
            try {
                BufferedReader br = new BufferedReader(new FileReader("odd.txt"));

                while ((line = br.readLine()) != null) {
                    System.out.print(line+ " ");
                }
                sc.close();
                br.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}