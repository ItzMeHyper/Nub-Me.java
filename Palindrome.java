import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {

        int i, len = 0, flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        len = str.length();

        for (i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }
    }
}