import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WaterPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, String type, String food, String sound, int hp){
        super(name, level, type, food, sound, hp);
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used surf on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 10 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -10;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Grass pokemon loses 20 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 20;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Fire pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used hydropump on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 10 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -10;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Grass pokemon loses 20 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 20;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Fire pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used hydrocanon on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 10 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -10;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Grass pokemon loses 20 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 20;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Fire pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used raindance on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Raindance has no effect on " + gymPokemon.getName());
            int hp = gymPokemon.getHp();
            int newHp = hp;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 10 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -10;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Grass pokemon gets 20 hp boost");
            int hp = gymPokemon.getHp();
            int newHp = hp + 20;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Fire pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }

    }

    public List<String> getAttacks(){
        return attacks;
    }
}
