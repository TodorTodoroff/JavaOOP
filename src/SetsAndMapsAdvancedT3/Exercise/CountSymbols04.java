package SetsAndMapsAdvancedT3.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,Integer> letters = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            letters.putIfAbsent(String.valueOf(current), 0);
            int currentNumber = letters.get(String.valueOf(current));
            letters.put(String.valueOf(current), currentNumber + 1);
        }
        letters.forEach((key, value) -> System.out.printf("%s: %d time/s%n", key, value));
    }
}
