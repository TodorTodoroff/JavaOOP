package Exams.Feb20;

import java.util.Scanner;
import java.util.Arrays;

public class Bomb {
    static int row = 0;
    static int col = 0;
    static int bombsOnMap = 0;
    static boolean isFinished = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");

        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            matrix[row] = line.toCharArray();
            if (line.contains("B")) {
                bombsOnMap++;
            }
            for (char chars : matrix[row]) {
                if (chars == 'B') {
                    bombsOnMap++;
                }
            }
        }

        for (String command : commands) {
            switch (command) {
                case "up":
                    isFinished = moveSapper(matrix, row - 1, col);
                    break;
                case "down":
                    isFinished = moveSapper(matrix, row + 1, col);
                    break;
                case "left":
                    isFinished = moveSapper(matrix, row, col - 1);
                    break;
                case "right":
                    isFinished = moveSapper(matrix, row, col + 1);
                    break;
            }
            if (isFinished) {
                break;
            }
        }
        if (bombsOnMap == 0) {
            System.out.println("Congratulations! You found all bombs!");
        } else if (isFinished) {
            System.out.printf("END! %d bombs left on the field", bombsOnMap);
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", bombsOnMap, row, col);
        }

    }

    private static boolean moveSapper(char[][] matrix, int r, int c) {
        row = r;
        col = c;
        adjustIndexesInBoundsOfMatrix(matrix);
        char current = matrix[row][col];
        matrix[row][col] = '+';
        if (current == 'B') {
            System.out.println("You found a bomb!");
            bombsOnMap--;
        }else if (current == 'e'){
            return true;
        }
        return false;
    }

    private static void adjustIndexesInBoundsOfMatrix(char[][] matrix) {
        if (row >= matrix.length) {
            row = matrix.length - 1;
        } else if (row < 0) {
            row = 0;
        }
        if (col >= matrix.length) {
            col = matrix.length - 1;
        } else if (col < 0) {
            col = 0;
        }
    }
}
