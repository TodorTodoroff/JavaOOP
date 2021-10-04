package FunctionalProgrammingT5.Exercise;

import org.w3c.dom.ls.LSException;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        Collections.reverse(input);

        List<Integer> filter = input.stream().filter(x -> x % n != 0).collect(Collectors.toList());

        filter.forEach(x -> System.out.print(x +" "));

    }
}
