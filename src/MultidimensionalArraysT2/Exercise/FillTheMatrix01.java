package MultidimensionalArraysT2.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int dimension = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];
        int[][] matrix = new int[dimension][dimension];

        if (pattern.equals("A")) {
            fillMatrixPatternA(matrix);
        } else if (pattern.equals("B")) {
            fillMatrixPatternB(matrix);
        }
        printMatrix(matrix);


    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int counterB = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = counterB;
                    counterB++;
                }
            } else {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = counterB;
                    counterB++;
                }
            }
        }
    }


    public static void fillMatrixPatternA(int[][] matrix) {
        int counterB = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = counterB;
                counterB++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(String.join("", Arrays.toString(matrix[i]).replace("[", "")
                    .replace(",", "")
                    .replace("]", "")));
        }

    }


}
