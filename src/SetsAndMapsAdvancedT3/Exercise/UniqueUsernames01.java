package SetsAndMapsAdvancedT3.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            String input = scanner.nextLine();

            set.add(input);


        }
        for (String s : set) {
            System.out.println(s);
        }

    }
}
