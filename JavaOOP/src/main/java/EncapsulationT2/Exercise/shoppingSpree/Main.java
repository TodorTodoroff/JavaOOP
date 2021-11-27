package EncapsulationT2.Exercise.shoppingSpree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> peopleMap = new LinkedHashMap<>();
        Map<String, Product> productsMap = new HashMap<>();

        String[] line = scanner.nextLine().split(";");

        for (String s : line) {
            String name = s.split("=")[0];
            double money = Double.parseDouble(s.split("=")[1]);

            try {
                Person person = new Person(name, money);
                peopleMap.put(name, person);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        line = scanner.nextLine().split(";");

        for (String l : line) {
            String name = l.split("=")[0];
            double cost = Double.parseDouble(l.split("=")[1]);

            try {
                Product product = new Product(name, cost);
                productsMap.put(name, product);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;

            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String personName = command.split("\\s+")[0];
            String productName = command.split("\\s+")[1];

            try {
                Person person = peopleMap.get(personName);
                Product product = productsMap.get(productName);
                person.buyProduct(product);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            command = scanner.nextLine();
        }

        for (Person person : peopleMap.values()) {
            System.out.print(person.getName() + " - ");
            String output;

            if (person.getProducts().isEmpty()) {
                output = "Nothing bought";

            } else {
                output = person.getProducts().stream().map(Product::getName).collect(Collectors.joining(", "));
            }
            System.out.println(output);
        }

    }
}
