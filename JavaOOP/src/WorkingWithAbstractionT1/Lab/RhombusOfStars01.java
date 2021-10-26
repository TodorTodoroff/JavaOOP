package WorkingWithAbstractionT1.Lab;

import java.util.Scanner;

public class RhombusOfStars01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printFigure(n);
    }

    private static void printFigure(int n) {
        printTop(n);
        printLineOfSpacesOrStars(n, "* ");
        System.out.println();
        printBottom(n);
    }

    private static void printBottom(int n) {
        for (int i = 1; i < n; i++) {
            printLineOfSpacesOrStars(i, " ");
            printLineOfSpacesOrStars(n - i, "* ");
            System.out.println();
        }
    }

    private static void printTop(int n) {
        for (int i = 1; i < n; i++) {
            printLineOfSpacesOrStars(n - i, " ");
            printLineOfSpacesOrStars(i, "* ");
            System.out.println();
        }
    }

    private static void printLineOfSpacesOrStars(int i2, String s) {
        for (int j = 0; j < i2; j++) {
            System.out.print(s);
        }
    }
}
