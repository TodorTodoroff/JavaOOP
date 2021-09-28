package FunctionalProgrammingT5.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(", ");

        if (numbers.length < 2) {
            System.out.println("Count = " + numbers.length);
            System.out.println("Sum = " + numbers[0]);
        } else {
            Function<String, Integer> fun = Integer::parseInt;
            int sum = 0;
            for (String s : numbers) sum += fun.apply(s);
            System.out.println("Count = " + numbers.length);
            System.out.println("Sum = " + sum);
        }
    }
}
