package SetsAndMapsAdvancedT3.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();
        int lineCounter = 1;
        String element = "";

        while (!input.equals("stop")) {
            if (lineCounter % 2 != 0) {
                resources.putIfAbsent(input, 0);
                element = input;
            } else {
                resources.put(element, resources.get(element) + Integer.parseInt(input));
            }
            lineCounter++;
            input = scanner.nextLine();
        }
        resources.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
