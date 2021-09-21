package SetsAndMapsAdvancedT3.Lab;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> map = new TreeMap<>();

        while (n-- > 0) {
            String name = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
            map.putIfAbsent(name, grades);

        }
        map.entrySet().stream().forEach(e -> {
            DecimalFormat decimalFormat = new DecimalFormat("#.################");
            double average = 0;
            for (Double dou : e.getValue()) {
                average += dou;
            }
            average /= e.getValue().size();
            System.out.println(e.getKey() + " is graduated with " + decimalFormat.format(average));
        });
    }
}
