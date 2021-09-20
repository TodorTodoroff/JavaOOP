package MultidimensionalArraysT2.Exercise;

import java.util.Arrays;
import java.util.Scanner;


public class MatrixShuffling05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        matrix = readMatrix(scanner, matrix);
        input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("END")) {
            if (commandIsValid(input, rows, cols)) {
                int row1 = Integer.parseInt(input[1]);
                int col1 = Integer.parseInt(input[2]);
                int row2 = Integer.parseInt(input[3]);
                int col2 = Integer.parseInt(input[4]);
                String element1 = matrix[row1][col1];
                String element2 = matrix[row2][col2];
                matrix[row1][col1] = element2;
                matrix[row2][col2] = element1;
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine().split("\\s+");
        }

    }

    private static boolean commandIsValid(String[] input, int rows, int cols) {
        if (!input[0].equals("swap")) return false;
        if (input.length != 5) return false;
        int row1 = Integer.parseInt(input[1]);
        int col1 = Integer.parseInt(input[2]);
        int row2 = Integer.parseInt(input[3]);
        int col2 = Integer.parseInt(input[4]);
        if (row1 < 0 || row1 > rows || row2 < 0 || row2 > rows || col1 < 0 || col1 > cols || col2 < 0 || col2 > cols) {
            return false;
        }
        return true;
    }

    private static String[][] readMatrix(Scanner scanner, String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }

    public static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            System.out.println(Arrays.toString(strings).replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
        }
    }

}
