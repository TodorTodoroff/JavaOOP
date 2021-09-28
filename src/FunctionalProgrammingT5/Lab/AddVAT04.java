package FunctionalProgrammingT5.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = num -> num * 1.2;

        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVat)
                .forEach(x -> System.out.printf("%.2f%n", x));
    }
}
