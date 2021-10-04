package FunctionalProgrammingT5.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Object> calculateMin = x ->
            Arrays.stream(x).min().getAsInt();

        System.out.println(calculateMin.apply(nums));
    }
}
