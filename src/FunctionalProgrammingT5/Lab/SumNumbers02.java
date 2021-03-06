package FunctionalProgrammingT5.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class SumNumbers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        Function<String, Integer> inputCount = x -> x.split(", ").length;

        Function<String, Integer> sum = x -> Arrays.stream(x.split(", "))
                .mapToInt(Integer::parseInt)
                .sum();

        Consumer<Integer> printCount = x -> System.out.println("Count = " + x);

        printCount.accept(inputCount.apply(numbers));
        System.out.println("Sum = " + sum.apply(numbers));

    }
}

