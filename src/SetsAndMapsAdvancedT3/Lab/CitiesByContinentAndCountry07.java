package SetsAndMapsAdvancedT3.Lab;

import java.util.*;

public class CitiesByContinentAndCountry07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> allTogether = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String input = scanner.nextLine();
            String continent = input.split("\\s+")[0];
            String country = input.split("\\s+")[1];
            String city = input.split("\\s+")[2];

            allTogether.putIfAbsent(continent, new LinkedHashMap<>());
            allTogether.get(continent).putIfAbsent(country, new ArrayList<>());
            allTogether.get(continent).get(country).add(city);

        }
allTogether.entrySet().stream()
        .forEach(entry -> {
            System.out.println(entry.getKey() + ":");
            entry.getValue().entrySet().stream()
                    .forEach(ie -> {
                        System.out.println("  " + ie.getKey() + " -> "
                        + String.join(", ",ie.getValue()));
                    });
        });

    }
}
