package InterfacesAndAbstractionT4.Exercises.foodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Citizen> citizenMap = new HashMap<>();
        Map<String, Rebel> rebelMap = new HashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            if (tokens.length == 3) {
                Rebel rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                rebel.buyFood();
                rebelMap.put(tokens[0], rebel);
            } else if (tokens.length == 4) {
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                citizen.buyFood();
                citizenMap.put(tokens[0], citizen);
            }
        }
        String name = scanner.nextLine();
        int sum = 0;

        while (!name.equals("End")) {
            if (citizenMap.containsKey(name)) {
                sum += citizenMap.get(name).getFood();
            } else if (rebelMap.containsKey(name)) {
                sum += rebelMap.get(name).getFood();
            }

            name = scanner.nextLine();
        }
        System.out.println(sum);

    }
}
