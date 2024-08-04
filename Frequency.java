import java.util.Scanner;

public class Frequency {
    public static void main(String args[]) {

        int i, len = 0, count =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Enter the Character: ");
        char ch = sc.nextLine().charAt(0);

        len = str.length();

        for (i = 0; i < len; i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Count of occurance of " +ch+ " = " +count);
    }
}