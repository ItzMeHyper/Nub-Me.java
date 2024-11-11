import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        int n, i, j;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows & columns: ");
        n = sc.nextInt();

        int[][] Mat = new int[n][n];

        System.out.println("\nThe identity matrix is:\n");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    Mat[i][j] = 1;
                } else {
                    Mat[i][j] = 0;
                }
                System.out.print(Mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
