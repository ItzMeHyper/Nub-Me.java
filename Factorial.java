import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        int n, i, fact = 1;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        sc.close();

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("The factorial of the given number is: " + fact);
    }
}