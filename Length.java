import java.util.Scanner;

public class Length {
    public static void main(String args[]) {
        int len;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        len = str.length();

        System.out.println("Length of the given string = " +len);
        sc.close();
    }
}