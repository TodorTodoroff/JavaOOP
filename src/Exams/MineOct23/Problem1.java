package Exams.MineOct23;

import java.util.Scanner;

public class Problem1 {
    static int row = 0;
    static int col = 0;
    static int cheese = 0;
    static boolean isOut = false;
    static String command = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();

            if (line.contains("M")) {
                row = i;
                col = line.indexOf("M");
            }

        }
        command = scanner.nextLine();
        while (!command.equals("end")) {
            checkCommandAndMove(matrix, command);
            if (isOut) {
                break;
            }
            command = scanner.nextLine();
        }
        if (isOut) {
            System.out.println("Where is the mouse?");
        }
        if (cheese >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", cheese);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - cheese);
        }
        printMatrix(matrix);

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            System.out.println(String.valueOf(chars)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(" ", "")
                    .replace(",", ""));
        }

    }

    private static void checkCommandAndMove(char[][] matrix, String command) {
        switch (command) {
            case "up":
                moveMouse(matrix, row - 1, col);
                break;
            case "down":
                moveMouse(matrix, row + 1, col);
                break;
            case "left":
                moveMouse(matrix, row, col - 1);
                break;
            case "right":
                moveMouse(matrix, row, col + 1);
                break;
        }

    }

    private static void moveMouse(char[][] matrix, int r, int c) {
        matrix[row][col] = '-';
        row = r;
        col = c;
        isOut = checkIfMouseIsOut(matrix, r, c);
        if (isOut) {
            return;
        }
        char current = matrix[row][col];
        matrix[row][col] = '-';
        if (current == 'c') {
            cheese++;
        }
        if (current == 'B') {
            checkCommandAndMove(matrix, command);
        }
        matrix[row][col] = 'M';
    }

    private static boolean checkIfMouseIsOut(char[][] matrix, int r, int c) {
        return col < 0 || col >= matrix.length || row < 0 || row >= matrix[col].length;
    }
}
