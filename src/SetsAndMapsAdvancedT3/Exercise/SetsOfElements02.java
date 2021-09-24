package SetsAndMapsAdvancedT3.Exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

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
            int setTwoValues = Integer.parseInt(scanner.nextLine());
            setTwo.add(setTwoValues);
        }
        Set<Integer> contains = new LinkedHashSet<>();


    }
}