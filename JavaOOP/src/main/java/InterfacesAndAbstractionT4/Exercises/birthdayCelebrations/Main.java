package InterfacesAndAbstractionT4.Exercises.birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Birthable> birthables = new ArrayList<>();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Robot":
                    Robot robot = new Robot(tokens[1], tokens[2]);
                    break;
                case "Pet":
                    Pet pet = new Pet(tokens[1], tokens[2]);
                    birthables.add(pet);

                    break;
                case "Citizen":
                    Citizen citizen = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                    birthables.add(citizen);
                    break;
            }

            line = scanner.nextLine();
        }
        String birthDate = scanner.nextLine();

        System.out.println(birthables.stream().map(Birthable::getBirthDate)
                .filter(date -> date.endsWith(birthDate)).collect(Collectors.joining(System.lineSeparator())));
    }
}
