package MultidimensionalArraysT2.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        int[][] matrix = new int[rows][cols];
        matrix = readMatrix(scanner, matrix);

        int bestSum = 0;
        int rowIndex = 0, colIndex = 0;
        for (int z = 0; z < rows - 2; z++) {
            for (int i = 0; i < cols - 2; i++) {
                int sum = 0;
                for (int j = z; j < 3 + z; j++) {
                    for (int k = i; k < 3 + i; k++) {
                        sum += matrix[j][k];
                    }
                }
                if (sum > bestSum) {
                    bestSum = sum;
                    rowIndex = z;
                    colIndex = i;
                }
            }
        }
        printMatrix(matrix, rowIndex, colIndex);

    }

    private static void printMatrix(int[][] matrix, int rowIndex, int colIndex) {
        for (int i = rowIndex; i < rowIndex + 3; i++) {
            for (int j = colIndex; j < colIndex + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[i] = arr;
        }
        return matrix;
    }
}
