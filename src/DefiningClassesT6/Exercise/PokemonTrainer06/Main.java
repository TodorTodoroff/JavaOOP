package DefiningClassesT6.Exercise.PokemonTrainer06;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Set<Trainer> trainers = new LinkedHashSet<>();
        Trainer trainer;
        Pokemon pokemon;

        while (!input[0].equals("Tournament")) {

            String trainerName = input[0];
            String pokemonName = input[1];
            String pokemonElement = input[2];
            int pokemonHealth = Integer.parseInt(input[3]);
            pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainer = new Trainer(trainerName, pokemon);

            trainers.add(trainer);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {


        }

        command = scanner.nextLine();
    }


}
