package MultidimensionalArraysT2.Lab;


import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] matrixDimensionsFirst = readDimensions(scanner);
        int[][] matrixOne = readMatrix(matrixDimensionsFirst[0], matrixDimensionsFirst[1], scanner);

        int[] matrixDimensionsSecond = readDimensions(scanner);
        int[][] matrixTwo = readMatrix(matrixDimensionsSecond[0], matrixDimensionsSecond[1], scanner);

        if (areEqual(matrixOne, matrixTwo)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    private static int[] readDimensions(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }

    public static boolean areEqual(int[][] one, int[][] two) {
        if (one.length != two.length)
            return false;
        for (int i = 0; i < one.length; i++) {
            if (one[i].length != two[i].length)
                return false;
            for (int j = 0; j < one[i].length; j++) {
                if (one[i][j] != two[i][j])
                    return false;
            }
        }
        return true;
    }

    public static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            int[] arr = readDimensions(scanner);
            matrix[i] = arr;
        }
        return matrix;
    }
}
