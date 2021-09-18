package MultidimensionalArraysT2.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2x2Submatrix05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split(", ")[0]);
        int[][] matrix = readMatrix(rows, scanner);
        int[][] outputMatrix = new int[2][2];

        int maxSum = 0;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int current = matrix[i][j];
                int right = matrix[i][j + 1];
                int bottom = matrix[i + 1][j];
                int bottomRight = matrix[i + 1][j + 1];
                int sum = current + right + bottomRight + bottom;
                if (sum > maxSum) {
                    maxSum = sum;
                    outputMatrix[0][0] = current;
                    outputMatrix[0][1] = right;
                    outputMatrix[1][0] = bottom;
                    outputMatrix[1][1] = bottomRight;

                }
            }
        }
        for (int i = 0; i < outputMatrix.length; i++) {
            System.out.println(outputMatrix[i][0] + " " + outputMatrix[i][1]);
        }
        System.out.println(maxSum);

    }

    public static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int arr[] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        return matrix;
    }
}
