import java.util.Scanner;

public class Factorial_2 {
    public static void main(String args[]) {
        int n, i = 1, fact = 1;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        n = sc.nextInt();

        while(i<=n){
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial of " +n+ " is: " + fact);
        sc.close();
    }
}