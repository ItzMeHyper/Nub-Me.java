import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chr;
        do {
            System.out.println("Enter your choice");
            System.out.println("1.Arithmetic operation ");
            System.out.println("2.Array access");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        System.out.println("Enter the number to be divided");
                        int num1 = sc.nextInt();
                        System.out.println("Enter the divisor");
                        int num2 = sc.nextInt();
                        int result = num1 / num2;
                        System.out.println("The result is " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Caught an exception " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        int array[] = { 2, 5, 8, 9 };
                        System.out.println("Enter the index you want to acess ");
                        int index = sc.nextInt();
                        System.out.println("The number in " + index + " is " + array[index]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Caught an exception " + e.getMessage());

                    }
                    break;
                default:
                    System.out.println("Invalid ch");
                    break;
            }
            System.out.println("Do you want to continue: type Y or N ");
            chr = sc.next().charAt(0);
        } while (chr == 'y' || chr == 'Y');
        sc.close();
    }
}
