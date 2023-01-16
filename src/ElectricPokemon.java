import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("electroball", "thunderpunch", "thunder", "volttackle");

    public ElectricPokemon (String name, int level, String type, String food, String sound, int hp){
        super(name, level, type, food, sound, hp);
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used electroball on " + gymPokemon.getName());
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used thunderpunch on " + gymPokemon.getName());
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used thunder on " + gymPokemon.getName());
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used volttackle on " + gymPokemon.getName());
    }

    public List<String> getAttacks(){
        return attacks;
    }
}
