package FunctionalProgrammingT5.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

//        System.out.println(String.join(", ", numbers.toString().replace("[","").replace("]","")));
//        numbers.sort(Integer::compareTo);
//        System.out.println(String.join(", ", numbers.toString().replace("[","").replace("]","")));
        String firstOutput = evenNumbers
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(firstOutput);

        String secondOutput = evenNumbers
                .stream()
                .sorted(Integer::compareTo)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(secondOutput);
    }
}
