package SetsAndMapsAdvancedT3.Lab;

import java.util.*;

public class AverageStudentsGrades05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrades = new TreeMap<>();

        while (n-- > 0) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            double grade = Double.parseDouble(input.split("\\s+")[1]);

            studentGrades.putIfAbsent(name, new ArrayList<>());
            studentGrades.get(name).add(grade);

        }
        for (String key : studentGrades.keySet()) {
            System.out.print(key + " -> ");
            studentGrades.get(key).forEach(e -> {
                System.out.printf("%.2f ", e);
            });
                System.out.printf("(avg: %.2f)%n",studentGrades.get(key).stream().mapToDouble(x->x).average().getAsDouble());
        }

    }
}
