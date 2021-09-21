package MultidimensionalArraysT2.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        int[][] matrix = new int[rows][cols];
        matrix = readMatrix(scanner, matrix);


    }

    private static int[][] readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            matrix[i] = arr;
        }
        return matrix;
    }
}
