package MultidimensionalArraysT2.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Crossfire07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        int[][] matrix = new int[rows][cols];

        matrix = fillMatrix(matrix);
        input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int rowBlast = Integer.parseInt(input.split("\\s+")[0]);
            int colBlast = Integer.parseInt(input.split("\\s+")[1]);
            int radius = Integer.parseInt(input.split("\\s+")[2]);

            for (int i = rowBlast - radius; i <= rowBlast + radius; i++) {
                if (i < matrix.length && i >= 0 && i < matrix[i].length) {
                    matrix[i][colBlast] = -666;
                }
            }

            for (int i = colBlast - radius; i <= colBlast + radius; i++) {
                if (i < matrix[rowBlast].length && i >= 0) {
                    matrix[rowBlast][i] = -666;
                }
            }
            matrix = removeElements(matrix);

            input = scanner.nextLine();
        }

        printMatrix(matrix);

    }

    private static int[][] removeElements(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            List<Integer> deiba = new ArrayList<>();
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != -666) {
                    deiba.add(matrix[i][j]);
                }
            }
            newMatrix[i] = deiba.stream().mapToInt(Integer::intValue).toArray();
        }
        return newMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt != -666)
                    System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

    private static int[][] fillMatrix(int[][] matrix) {
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = counter++;
            }
        }
        return matrix;
    }
}
