import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    List<String> attacks = Arrays.asList("inferno", "pyroBall", "firelash", "FlameThrower");

    public FirePokemon(String name, int level, String type, String food, String sound, int hp) {
        super(name, level, type, food, sound, hp);
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " used inferno on " + gymPokemon.getName());
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " pyroball on " + gymPokemon.getName());
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " used firelash on " + gymPokemon.getName());
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " used flamethrower on " + gymPokemon.getName());
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
