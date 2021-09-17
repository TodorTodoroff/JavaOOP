package MultidimensionalArraysT2.Lab;


import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rows = Integer.parseInt(scanner.nextLine().split("\\s+")[0]);
        int[][] matrixOne = readMatrix(rows, scanner);

        rows = Integer.parseInt(scanner.nextLine().split("\\s+")[0]);
        int[][] matrixTwo = readMatrix(rows, scanner);

        boolean areEqual = areEqual(matrixOne, matrixTwo);
        String output = areEqual ? "equal" : "not equal";

        System.out.println(output);
    }


    public static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int arr[] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        return matrix;
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

}
