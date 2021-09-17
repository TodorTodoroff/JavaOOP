package MultidimensionalArraysT2.Lab;


import java.util.Scanner;

public class CompareMatrices01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int[][] matrixOne = new int[n][x];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                matrixOne[i][j] = scanner.nextInt();
            }
        }

        n = scanner.nextInt();
        x = scanner.nextInt();
        int[][] matrixTwo = new int[n][x];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                matrixTwo[i][j] = scanner.nextInt();
            }
        }
        if (areEqual(matrixOne,matrixTwo)) {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }

    public static boolean areEqual(int[][] one, int[][] two) {
        if (one.length != two.length)
            return false;
        for (int i = 0; i < one.length; i++) {
            if (one[i].length != two[i].length)
                return false;
            for (int j = 0; j < two.length; j++) {
                if (one[j].length != two[j].length)
                    return false;
            }
        }
        return true;
    }
}
