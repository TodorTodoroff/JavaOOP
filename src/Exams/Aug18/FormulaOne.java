package Exams.Aug18;

import java.util.Scanner;

public class FormulaOne {
    static int row = 0;
    static int col = 0;
    static boolean isFinished = false;
    static String command = "";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("P")) {
                row = i;
                col = line.indexOf("P");
            }
        }

        while (count-- > 0) {
            command = scanner.nextLine();
            checkCommandAndMove(matrix, command);
        }

    }

    private static void checkCommandAndMove(char[][] matrix, String command) {
        switch (command) {
            case "up":
                isFinished = moveBolid(matrix, row - 1, col);
                break;
            case "down":
                isFinished = moveBolid(matrix, row + 1, col);
                break;
            case "left":
                isFinished = moveBolid(matrix, row, col - 1);
                break;
            case "right":
                isFinished = moveBolid(matrix, row, col + 1);
                break;
        }
    }

    private static boolean moveBolid(char[][] matrix, int r, int c) {
        correctIndexesIfPlayerOutOfBounds(matrix);
        char current = matrix[r][c];
        if (current == 'B') {
            row = r;
            col = c;
            checkCommandAndMove(matrix, command);
        } else if (current == '.') {
            row = r;
            col = c;
        }
        if (current == 'F') {
            row = r;
            col = c;
            matrix[row][col] = 'P';
            return true;
        }
        return false;
    }

    private static void correctIndexesIfPlayerOutOfBounds(char[][] matrix) {
        if (row < 0) {
            row = matrix.length - 1;
        } else if (row >= matrix.length) {
            row = 0;
        } else if (col < 0) {
            col = matrix[row].length - 1;
        } else if (col >= matrix[row].length) {
            col = 0;
        }
    }
}
