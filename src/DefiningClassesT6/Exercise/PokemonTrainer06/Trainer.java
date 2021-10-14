package DefiningClassesT6.Exercise.PokemonTrainer06;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String trainerName;
    private int trainerNumberOfBadges = 0;
    private Pokemon pokemon;
    private List<Pokemon> pokemons;

    public Trainer(String name, Pokemon pokemon) {
        this.trainerName = name;
        this.pokemon = pokemon;
        this.pokemons = new ArrayList<>();
        this.pokemons.add(pokemon);
    }

}
