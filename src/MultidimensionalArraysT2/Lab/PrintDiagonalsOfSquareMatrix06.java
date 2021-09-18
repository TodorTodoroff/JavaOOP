package MultidimensionalArraysT2.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(rows, scanner);

//        1 2 3
//        1 2 3
//        1 2 3
        int row = 0, col = 0;
        while (row < rows && col < rows) {
            System.out.print(matrix[row][col] + " ");
            row++;
            col++;
        }
        System.out.println();
        row = rows - 1;
        col = 0;
        while (row >= 0 && col < rows) {
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }
    }

    private static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }
        return matrix;
    }

}
