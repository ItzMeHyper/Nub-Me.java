import java.util.Scanner;

public class N_Natural {
    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        n = sc.nextInt();
        sc.close();

        for (i = 1; i <= n; i++) {

            System.out.print(+i+ "  " );

        }
    }
}