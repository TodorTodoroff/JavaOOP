package SetsAndMapsAdvancedT3.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> phonebook = new HashMap<>();

        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String number = input.split("-")[1];
            phonebook.putIfAbsent(name, number);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        String output = "";
        while (!input.equals("stop")) {
            if (phonebook.containsKey(input)) {
                output = input + " -> " + phonebook.get(input);
            } else {
                output = "Contact " + input + " does not exist.";
            }
            System.out.println(output);
            input = scanner.nextLine();

        }
    }
}
