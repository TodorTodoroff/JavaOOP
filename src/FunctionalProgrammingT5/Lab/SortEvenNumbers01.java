package FunctionalProgrammingT5.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        Function<Stream<Integer>, String> function = x -> x.map(String::valueOf)
                .collect(Collectors.joining(", "));

        String firstOutput = function.apply(evenNumbers.stream());

        System.out.println(firstOutput);

        String secondOutput = function.apply(evenNumbers.stream().sorted());

        System.out.println(secondOutput);
    }
}
