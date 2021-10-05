package FunctionalProgrammingT5.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PredicateParty10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String command = input.split("\\s+")[0];
            String secondCommand = input.split("\\s+")[1];
            String action = input.split("\\s+")[2];


            input = scanner.nextLine();
        }

    }
}
