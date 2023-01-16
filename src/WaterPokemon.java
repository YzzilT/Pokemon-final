import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, String type, String food, String sound, int hp){
        super(name, level, type, food, sound, hp);
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used surf on " + gymPokemon.getName());
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used hydropump on " + gymPokemon.getName());
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used hydrocanon on " + gymPokemon.getName());
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used raindance on " + gymPokemon.getName());
        if (WaterPokemon
    }

    public List<String> getAttacks(){
        return attacks;
    }
}
