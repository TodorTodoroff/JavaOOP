package FunctionalProgrammingT5.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<List<Integer>, List<Integer>> add = x -> x.stream().map(num -> num += 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multuply = x -> x.stream().map(num -> num *= 2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> suntract = x -> x.stream().map(num -> num -= 1).collect(Collectors.toList());
        Consumer<List<Integer>> print = x -> x.forEach(el -> System.out.print(el + " "));

        List<Integer> nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    nums = add.apply(nums);
                    break;
                case "multiply":
                    nums = multuply.apply(nums);
                    break;
                case "subtract":
                    nums = suntract.apply(nums);
                    break;
                case "print":
                    print.accept(nums);
                    break;
            }
            command = scanner.nextLine();
        }

    }
}
