import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows & columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] Mat = new int[row][col];

        System.out.println("Entered matrix is of (" + row + " X " + col + ") size.");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                Mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe Original matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(Mat[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nThe Transposed matrix is:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(Mat[j][i] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
