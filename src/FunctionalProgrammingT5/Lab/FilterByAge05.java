package FunctionalProgrammingT5.Lab;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterByAge05 {

    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = IntStream.range(0, n)
                .mapToObj(ignored -> {
                    String[] tokens = scanner.nextLine().split(", ");
                    return new Person(tokens[0], Integer.parseInt(tokens[1]));
                })
                .collect(Collectors.toList());

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String[] format = scanner.nextLine().split("\\s+");

        var filter = getFilter(condition, age);
        var printer = getPrinter(format);

        people
                .stream()
                .filter(getFilter(condition, age))
                .forEach(getPrinter(format));
    }

    private static Consumer<Person> getPrinter(String[] format) {
        if (format.length == 2)
            return p -> System.out.println(p.name + " - " + p.age);

        return p -> System.out.println(p.name);
    }

    public static Predicate<Person> getFilter(String condition, int age) {
        if (condition.equals("older"))
            return p -> p.age >= age;

        return p -> p.age <= age;
    }
}
