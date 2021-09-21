package SetsAndMapsAdvancedT3.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Double>> storeData = new TreeMap<>();

        while (!input.equals("Revision")) {
            String store = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            storeData.putIfAbsent(store, new LinkedHashMap<>());
            storeData.get(store).put(product, price);

            input = scanner.nextLine();
        }

        for (String key : storeData.keySet()){
            System.out.println(key + "->");
            for (var va : storeData.get(key).entrySet()){
                System.out.printf("Product: %s, Price: %.1f%n", va.getKey(),va.getValue());
            }
        }
    }
}
