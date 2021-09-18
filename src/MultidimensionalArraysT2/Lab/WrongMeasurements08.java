package MultidimensionalArraysT2.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(rows, scanner);
        String[] wrongIndexes = scanner.nextLine().split("\\s+");
        int rowIndex = Integer.parseInt(wrongIndexes[0]);
        int colIndex = Integer.parseInt(wrongIndexes[1]);

        int wrongNumber = matrix[rowIndex][colIndex];
        int[][] outputMatrix = new int[rows][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == wrongNumber) {
                    int correctNum = 0;
                    if (i < rows - 1 && matrix[i + 1][j] != wrongNumber) {
                        correctNum += matrix[i + 1][j]; //bottom
                    }
                    if (i > 0 && matrix[i - 1][j] != wrongNumber) {
                        correctNum += matrix[i - 1][j];//top
                    }
                    if (j < matrix[i].length - 1 && matrix[i][j + 1] != wrongNumber) {
                        correctNum += matrix[i][j + 1];//right
                    }
                    if (j > 0 && matrix[i][j - 1] != wrongNumber) {
                        correctNum += matrix[i][j - 1];//left
                    }
                    outputMatrix[i][j] = correctNum;
                }else {
                    outputMatrix[i][j] = matrix[i][j];
                }


            }
        }
        printMatrix(outputMatrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(String.join("", Arrays.toString(matrix[i]).replace("[", "")
                    .replace(",", "")
                    .replace("]", "")));
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
