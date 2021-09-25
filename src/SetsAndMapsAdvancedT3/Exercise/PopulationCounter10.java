package SetsAndMapsAdvancedT3.Exercise;

import java.util.*;

public class PopulationCounter10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Long>> allTogether = new LinkedHashMap<>();

        while (!input.equals("report")) {
            String[] inputAsArray = input.split("\\|");
            String country = inputAsArray[1];
            String city = inputAsArray[0];
            long population = Long.parseLong(inputAsArray[2]);

            allTogether.putIfAbsent(country, new LinkedHashMap<>());
            allTogether.get(country).put(city, population);

            input = scanner.nextLine();
        }
        allTogether.entrySet().stream()
                .sorted((country1, country2) -> country2.getValue().values().stream().reduce(0L, Long::sum)
                        .compareTo(country1.getValue().values().stream().reduce(0L, Long::sum)))
                .forEach(country -> {
                    System.out.printf("%s (total population: %d)%n", country.getKey(),
                            country.getValue().values().stream().reduce(0L, Long::sum));
                    country.getValue().entrySet().stream()
                            .sorted((city1, city2) -> city2.getValue().compareTo(city1.getValue()))
                            .forEach(city -> System.out.printf("=>%s: %d%n", city.getKey(), city.getValue()));
                });

    }
}
