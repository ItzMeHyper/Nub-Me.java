import java.util.Scanner;

public class MatMultiplication {
    public static void main(String args[]) {
        int r1, c1, r2, c2, i, j, k;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Matrix A");
        r1 = sc.nextInt();
        System.out.println("Enter the number of columns for Matrix A");
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows for Matrix B");
        r2 = sc.nextInt();
        System.out.println("Enter the number of columns for Matrix B");
        c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible c1 != r2.");
            sc.close();
            return;
        }

        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        int C[][] = new int[r1][c2];

        System.out.println("Read matrix A");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Read matrix B");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print("B[" + i + "][" + j + "]=");
                B[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix A\n");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matrix B\n");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Product Matrix C\n");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}