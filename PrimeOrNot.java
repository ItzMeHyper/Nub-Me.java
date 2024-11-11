import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String args[]) {
        int n, i, isprime = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        if (n == 1 || n == 0) {
            System.out.println("is neither prime nor a composite number");
        } else {
            for (i = 2; i*i <= n; i++) {
                if (n % i == 0) {
                    isprime = 0;
                    break;
                }
            }
            if (isprime == 1) {
                System.out.println("it is a prime number");
            } else {
                System.out.println("it is not a prime number");
            }
        }
    }
}
