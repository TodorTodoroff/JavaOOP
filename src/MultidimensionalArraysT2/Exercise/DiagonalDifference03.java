package MultidimensionalArraysT2.Exercise;

import java.util.Scanner;

public class DiagonalDifference03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        fillMatrix(scanner, n, matrix);

        int primaryDiag = primaryDiag(matrix);
        int secondaryDiag = secondaryDiag(matrix);

        System.out.println(Math.abs(primaryDiag - secondaryDiag));

    }

    private static int secondaryDiag(int[][] matrix) {
        int diag = 0;
        int row = matrix.length -1, col = 0;
        while (row >= 0  && col < matrix[0].length) {
            diag += matrix[row][col];
            row--;
            col++;
        }
        return diag;
    }

    private static int primaryDiag(int[][] matrix) {
        int diag = 0;
        int row = 0, col = 0;
        while (row < matrix.length && col < matrix[0].length) {
            diag += matrix[row][col];
            row++;
            col++;
        }
        return diag;
    }

    private static void fillMatrix(Scanner scanner, int n, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
