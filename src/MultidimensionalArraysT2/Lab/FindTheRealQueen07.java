package MultidimensionalArraysT2.Lab;

import java.util.Scanner;

public class FindTheRealQueen07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = readMatrix(scanner);

        int rowIndex = 0, colIndex = 0;

        for (int i = 0; i < 8; i++) {
            int queenCounter = 0;
            int currentCol = 0;
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] == 'q') {
                    queenCounter++;
                    currentCol = j;
                }
                if (queenCounter > 1) {
                    break;
                }
            }
            if (queenCounter == 1) {
                boolean isOnlyQueen = true;
                if (i < 7 && matrix[i + 1][currentCol] == 'q') {
                    //bottom
                    isOnlyQueen = false;
                } else if (i > 0 && matrix[i - 1][currentCol] == 'q') {
                    //top
                    isOnlyQueen = false;
                } else if (currentCol < 7 && matrix[i][currentCol + 1] == 'q') {
                    //right
                    isOnlyQueen = false;
                } else if (currentCol > 0 && matrix[i][currentCol - 1] == 'q') {
                    //left
                    isOnlyQueen = false;
                } else if ((i > 0 && currentCol > 0) && matrix[i + 1][currentCol - 1] == 'q') {
                    //topleft
                    isOnlyQueen = false;
                } else if ((i > 0 && currentCol < 7) && matrix[i + 1][currentCol + 1] == 'q') {
                    //topright
                    isOnlyQueen = false;
                } else if ((i < 7 && currentCol > 0) && matrix[i - 1][currentCol - 1] == 'q') {
                    //bottomLeft
                    isOnlyQueen = false;
                } else if ((i < 7 && currentCol < 7) && matrix[i - 1][currentCol + 1] == 'q') {
                    isOnlyQueen = false;
                }
                if (isOnlyQueen) {
                    rowIndex = i;
                    colIndex = currentCol;
                }
            }
        }
        System.out.println(rowIndex + " " + colIndex);

    }

    private static char[][] readMatrix(Scanner scanner) {
        char[][] matrix = new char[8][8];
        for (int i = 0; i < matrix.length; i++) {
            String[] arr = scanner.nextLine().split("\\s+");
            for (int j = 0; j < arr.length; j++) {
                char ch = arr[j].charAt(0);
                matrix[i][j] = ch;
            }
        }
        return matrix;
    }
}
