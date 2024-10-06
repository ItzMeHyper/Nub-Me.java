import java.io.*;

class FileException {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("filename1.txt");
            FileOutputStream fout = new FileOutputStream("filename2.txt");

            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
            fin.close();
            fout.close();

            System.out.println("Successfully wrote to the specified file");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
