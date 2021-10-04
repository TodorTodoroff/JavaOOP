package FunctionalProgrammingT5.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Consumer<String> printName = name -> System.out.println(name);

        for (String s : input) {
            printName.accept(s);
        }


    }
}
