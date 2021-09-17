package MultidimensionalArraysT2.Lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows,columns,scanner);
        char[][] secondMatrix = readMatrix(rows,columns,scanner);
        char[][] outputMatrix = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                char fillChar = firstMatrix[i][j] == secondMatrix[i][j]
                        ? firstMatrix[i][j] : '*';
                outputMatrix[i][j] = fillChar;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(outputMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static char[][] readMatrix(int rows, int columns, Scanner scanner) {
        char[][] arr = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            String currentAsStr = scanner.nextLine();
            String[] current = currentAsStr.split("\\s+");
            for (int j = 0; j < current.length; j++) {
                char ch = current[j].charAt(0);
                arr[i][j] = ch;
            }
        }
        return arr;
    }
}
