import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, i, first = 0, second = 1, next;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        System.out.println("Fibonacci series is");
        sc.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (i = 0; i < n; i++) {
                System.out.println(first + "");
                next = second + first;
                first = second;
                second = next;
            }
        }
    }
}
