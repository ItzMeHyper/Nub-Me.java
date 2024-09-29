import java.util.Scanner;

class ArithmeticHandler {
    void arithmetic(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Arithmetic operation completed.\n");
        }
    }
}

class ArrayIndexHandler {
     void arrayIndex(int index) {
        try {
            int[] array = new int[5];
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Array access operation completed.\n");
        }
    }
}

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch;
        char chr;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Arithmetic operation");
            System.out.println("2. Array access");
            System.out.println("3. Exit\n");
            ch = sc.nextInt();

            ArithmeticHandler aE = new ArithmeticHandler();
            ArrayIndexHandler aIE = new ArrayIndexHandler();

            switch (ch) {
                case 1:
                    System.out.print("Enter the number to be divided: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter the divisor: ");
                    int num2 = sc.nextInt();
                    aE.arithmetic(num1, num2);
                    break;

                case 2:
                    System.out.print("Enter the index you want to acess: ");
                    int index = sc.nextInt();
                    aIE.arrayIndex(index);
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Do you want to continue? Type Y or N");
            chr = sc.next().charAt(0);

        } while (chr == 'y' || chr == 'Y');

        sc.close();
    }
}
