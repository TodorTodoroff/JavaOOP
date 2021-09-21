package SetsAndMapsAdvancedT3.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> values = new LinkedHashMap<>();

        for (double v : input) {
            if (values.containsKey(v)) {
                values.put(v, values.get(v) + 1);
            } else {
                values.put(v, 1);
            }
        }
        for (Double key : values.keySet()) {
            System.out.printf("%.1f -> %d%n", key, values.get(key));
        }

    }
}
