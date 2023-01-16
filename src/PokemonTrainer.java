import java.awt.*;
import java.util.List;

public class PokemonTrainer {
    //8 variabelen, 1 constructor, getters en setters
    private String name;
    private String town;
    private List<Pokemon> pokemons;

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
