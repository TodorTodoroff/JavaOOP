package MultidimensionalArraysT2.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2x2Submatrix05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = Integer.parseInt(scanner.nextLine().split(", ")[0]);
        int[][] matrix = readMatrix(rows,scanner);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
            }
        }
        
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
