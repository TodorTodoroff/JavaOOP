package Exams.Feb222020;

import java.util.Arrays;
import java.util.Scanner;

public class ReVolt {
    static int row = 0;
    static int col = 0;
    static boolean hasWon = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int commandCount = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int i = 0; i < matrix.length; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("f")) {
                row = i;
                col = line.indexOf("f");
            }
        }

        while (commandCount-- > 0 && !hasWon) {
            String command = scanner.nextLine();
            commandType(matrix, command);
        }

        System.out.println(hasWon ? "Player won!" : "Player lost!");

        printMatrix(matrix);

    }

    private static void printMatrix(char[][] matrix) {

        for (char[] chars : matrix) {
            System.out.println(Arrays.toString(chars).replace("[", "")
                    .replace("]", "")
                    .replace(",", "").replace(" ", ""));
        }
    }

    private static void commandType(char[][] matrix, String command) {
        if (command.equals("up")) {
            movePlayer(matrix, row - 1, col, command);
        } else if (command.equals("down")) {
            movePlayer(matrix, row + 1, col, command);
        } else if (command.equals("left")) {
            movePlayer(matrix, row, col - 1, command);
        } else if (command.equals("right")) {
            movePlayer(matrix, row, col + 1, command);
        }
    }

    private static void movePlayer(char[][] matrix, int r, int c, String command) {
        if (isOutOfBounds(matrix, r, c)) {
            int[] newIndexes = goThroughTheDarkSide(matrix, r, c);
            r = newIndexes[0];
            c = newIndexes[1];
        }
        if (matrix[row][col] != 'T' && matrix[row][col] != 'B'){
            matrix[row][col] = '-';
        }

        if (matrix[r][c] != 'T') {
            row = r;
            col = c;
        }
        if (matrix[r][c] == 'B') {
            commandType(matrix, command);
        }
        if (matrix[row][col] == 'F') {
            hasWon = true;
        }
        if (matrix[row][col] == '-' || matrix[row][col] == 'F'){
            matrix[row][col] = 'f';
        }
    }

    private static int[] goThroughTheDarkSide(char[][] matrix, int row, int col) {
        int[] newIndexes = new int[2];
        if (row < 0) {
            newIndexes[0] = matrix.length - 1;
            newIndexes[1] = col;
        } else if (row >= matrix.length) {
            newIndexes[1] = col;
        } else if (col < 0) {
            newIndexes[0] = row;
            newIndexes[1] = matrix[row].length - 1;
        } else if (col >= matrix[row].length) {
            newIndexes[0] = row;
        }
        return newIndexes;
    }

    private static boolean isOutOfBounds(char[][] matrix, int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }
}
