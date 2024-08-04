import java.util.Scanner;

public class Nprime {
    public static void main(String args[]) {
        int n, i, j, flag;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        n = sc.nextInt();

        for (i = 2; i <= n; i++) {
            flag = 0;

            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(i);
            }
        }
    }
}