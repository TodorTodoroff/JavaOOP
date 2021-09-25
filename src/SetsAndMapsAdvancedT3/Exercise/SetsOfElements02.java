package SetsAndMapsAdvancedT3.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class SetsOfElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int set1 = Integer.parseInt(input.split("\\s+")[0]);
        int set2 = Integer.parseInt(input.split("\\s+")[1]);
        Set<Integer> setOne = new LinkedHashSet<>();
        Set<Integer> setTwo = new LinkedHashSet<>();


        while (set1-- > 0) {
            int setOneValue = Integer.parseInt(scanner.nextLine());
            setOne.add(setOneValue);

        }
        while (set2-- > 0) {
            int setTwoValue = Integer.parseInt(scanner.nextLine());
            setTwo.add(setTwoValue);
        }
        Set<Integer> contains = new LinkedHashSet<>();

        for (Integer e : setOne) {
            if (setTwo.contains(e)) {
                contains.add(e);
            }

        }
        //setOne.retainAll(setTwo);
        // checks if setTwo contains all the elements from setOne and leaves only the ones which are contained in both sets
        contains.forEach(e -> System.out.printf("%d ", e));
    }
}