package MultidimensionalArraysT2.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix);

        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            System.out.println();
        }

    }

    private static void fillMatrix(String[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                StringBuilder currentString = new StringBuilder();
                char middleChar = (char) (j + 97 + i);
                char current = (char) (j + 97);
                currentString.append(current).append(middleChar).append(current);
                matrix[j][i] = currentString.toString();
            }
        }
    }
}
