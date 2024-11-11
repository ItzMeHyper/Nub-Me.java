import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args){
        int r, c, i, j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        c = sc.nextInt();

        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int C[][] = new int[r][c];

        System.out.println("Read matrix A");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Read matrix B");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print("B[" + i + "][" + j + "]=");
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum Matrix of A&B:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
