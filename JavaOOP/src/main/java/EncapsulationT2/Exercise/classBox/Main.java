package EncapsulationT2.Exercise.classBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box;
        try {
            box = new Box(length, width, height);
            System.out.printf("Surface Area - %.2f%n" +
                            "Lateral Surface Area - %.2f%n" +
                            "Volume - %.2f"
                    , box.calculateSurfaceArea()
                    , box.calculateLateralSurfaceArea()
                    , box.calculateVolume());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
