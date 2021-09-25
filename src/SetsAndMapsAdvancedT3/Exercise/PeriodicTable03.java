package SetsAndMapsAdvancedT3.Exercise;

import java.util.*;

public class PeriodicTable03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            elements.addAll(Arrays.asList(input));

            //3 options for filling Set<>
            //1. -> forEach from input
            //2. -> Collections.addAll(Arrays.asList(input));
            //3. -> elements.addAll(Arrays.asList(input));
        }

       elements.forEach(e -> System.out.printf("%s ",e));
    }
}
