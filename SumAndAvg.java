import java.util.Scanner;

public class SumAndAvg {
    public static void main(String args[]) {
        int x, y, z, sum;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        System.out.print("Enter the third number: ");
        z = sc.nextInt();
        sum = x + y + z;
        avg = sum/3;
        System.out.println("The sum of three numbers x,y,z is: " + sum);
        System.out.println("The average of three numbers x,y,z is: " + avg);
        sc.close();
    }
}