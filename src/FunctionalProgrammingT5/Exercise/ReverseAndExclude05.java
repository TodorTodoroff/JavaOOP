package FunctionalProgrammingT5.Exercise;

import org.w3c.dom.ls.LSException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> filterNumbers = x -> x % n != 0;

        List<Integer> filter = input.stream().filter(filterNumbers).collect(Collectors.toList());

        List<Integer> reversed = filter.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(String.join(" ",String.valueOf(reversed)));


    }
}
