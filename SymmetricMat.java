import java.util.Scanner;

public class SymmetricMat {
    public static void main(String[] args) {
        int i, j, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of square matrix: ");
        int n = sc.nextInt();

        int Mat[][] = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                Mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(Mat[i][j] + "\t");
            }
            System.out.println();
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (Mat[i][j] != Mat[j][i]) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
        sc.close();
    }
}
