package WorkingWithAbstractionT1.Lab.PointInRectangle02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rectangleParameters = readArray(scanner);

        Point pointA = new Point(rectangleParameters[0], rectangleParameters[1]);
        Point pointC = new Point(rectangleParameters[2], rectangleParameters[3]);

        Rectangle rectangle = new Rectangle(pointA, pointC);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            int[] tokens = readArray(scanner);
            Point point = new Point(tokens[0], tokens[1]);

            boolean isInside = rectangle.contains(point);

            System.out.println(isInside);
        }


    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
