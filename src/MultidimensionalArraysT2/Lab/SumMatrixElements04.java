package MultidimensionalArraysT2.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split(", ")[0]);
        int[][] matrix = readMatrix(rows,scanner);
        System.out.println(rows);
        System.out.println(matrix[0].length);

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
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
