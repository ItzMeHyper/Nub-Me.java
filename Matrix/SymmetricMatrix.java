import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int flag = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();

        int[][] Mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                Mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe Original matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Mat[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Mat[i][j] != Mat[j][i]) {
                    flag = 0;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("Entered matrix is Symmetric");
        } else {
            System.out.println("Entered matrix is not Symmetric");
        }

        sc.close();
    }
}
