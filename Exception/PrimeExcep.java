import java.util.Scanner;

class PrimeException extends Exception{
    public PrimeException(String message){
        super(message);
    }
}

public class PrimeExcep{
    public static void calc(int n) throws PrimeException{

        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) {
                throw new PrimeException("Given number is not a prime number.");
            }
        }
        System.out.println("is a prime number");
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();

        try {
            calc(n);
        } catch (PrimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
