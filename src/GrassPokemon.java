import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("leafstorm", "leechseed", "leaveblade");

    public GrassPokemon (String name, int level, String type, String food, String sound, int hp) {
        super(name, level, type, food, sound, hp);
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used leafstorm on " + gymPokemon.getName());
    }

    public List<String> getAttacks(){
        return attacks;
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used leechseed on " + gymPokemon.getName());
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used leaveblade on " + gymPokemon.getName());
    }




}
