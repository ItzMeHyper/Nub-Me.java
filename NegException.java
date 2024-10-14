import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String s) {
        super(s);
    }
}

public class NegException {
    public static void NegNumber(int n) throws NegativeException {
        if (n < 0) {
            throw new NegativeException("Negative number...Number should be positive");
        } else {
            System.out.println("Number is positive");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        try {
            NegNumber(n);
        } catch (NegativeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
