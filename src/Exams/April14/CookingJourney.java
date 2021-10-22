package Exams.April14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CookingJourney {
    static int row = 0;
    static int col = 0;
    static int money = 0;
    static List<Integer> pillars = new ArrayList<>();
    static boolean isOut = false;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();

            if (line.contains("S")) {
                row = i;
                col = line.indexOf("S");
                matrix[row][col] = '-';
            }
            if (line.contains("P")) {
                for (int j = 0; j < line.length(); j++) {
                    if (line.charAt(j) == 'P') {
                        pillars.add(i);
                        pillars.add(line.indexOf("P"));
                    }
                }
            }
        }

        while (!isOut && money < 50) {
            String command = scanner.nextLine();

            switch (command) {
                case "up":
                    moveChef(matrix, row - 1, col);
                    break;
                case "down":
                    moveChef(matrix, row + 1, col);
                    break;
                case "left":
                    moveChef(matrix, row, col - 1);
                    break;
                case "right":
                    moveChef(matrix, row, col + 1);
                    break;
            }
            if (isOut) {
                System.out.println("Bad news! You are out of the pastry shop.");
                break;
            }
        }
        if (money >= 50) {
            matrix[row][col] = 'S';
            System.out.println("Good news! You succeeded in collecting enough money!");
        }
        System.out.println("Money: " + money);
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            System.out.println(Arrays.toString(chars)
                    .replace("[","")
                    .replace("]","")
                    .replace(",","")
                    .replace(" ",""));
        }
    }

    private static void moveChef(char[][] matrix, int r, int c) {
        row = r;
        col = c;
        isOut = checIfOutOfShop(matrix);

        if (isOut) {
            return;
        }
        char current = matrix[row][col];

        if (current == 'P' && (row == pillars.get(0) && col == pillars.get(1))) {
            row = pillars.get(2);
            col = pillars.get(3);
            matrix[row][col] = '-';
        } else if (current == 'P' && (row == pillars.get(2) && col == pillars.get(3))) {
            row = pillars.get(0);
            col = pillars.get(1);
            matrix[row][col] = '-';
        }
        if (current != 'P' && current != '-') {
            money += Integer.parseInt(String.valueOf(current));
        }

        matrix[r][c] = '-';
    }

    private static boolean checIfOutOfShop(char[][] matrix) {
        return col < 0 || col >= matrix.length || row < 0 || row >= matrix[col].length;
    }
}
