package SetsAndMapsAdvancedT3.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new TreeMap<>();
        Map<String, Integer> junkMaterials = new TreeMap<>();
        keyMaterials.put("shards",0);
        keyMaterials.put("fragments",0);
        keyMaterials.put("motes",0);

        String legendary = "";

        while (legendary.equals("")) {
            String[] input = scanner.nextLine().toLowerCase().split(" ");
            for (int i = 1; i <= input.length-1; i++) {
                if (i % 2 != 0) {
                    if (input[i].equals("shards") || input[i].equals("fragments") || input[i].equals("motes")) {

                        keyMaterials.put(input[i], keyMaterials.get(input[i]) + Integer.parseInt(input[i - 1]));
                        if (legendary.equals("")) {
                            legendary = getWinner(input, keyMaterials, legendary, i);
                        }
                    } else {
                        junkMaterials.putIfAbsent(input[i], 0);
                        junkMaterials.put(input[i], junkMaterials.get(input[i]) + Integer.parseInt(input[i - 1]));
                    }
                }
                if (!legendary.equals("")) {
                    break;
                }
            }

        }

        System.out.println(legendary + " obtained!");
        keyMaterials
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));


        junkMaterials
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));
    }


    private static String getWinner(String[] input, Map<String, Integer> keyMaterials, String legendary, int i) {
        if (keyMaterials.get(input[i]) >= 250) {
            switch (input[i]) {
                case "shards":
                    legendary = "Shadowmourne";
                    break;
                case "fragments":
                    legendary = "Valanyr";
                    break;
                case "motes":
                    legendary = "Dragonwrath";
                    break;
            }
            keyMaterials.put(input[i], keyMaterials.get(input[i]) - 250);
        }
        return legendary;
    }
}
