import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FirePokemon extends Pokemon {

    List<String> attacks = Arrays.asList("inferno", "pyroBall", "firelash", "FlameThrower");

    public FirePokemon(String name, int level, String type, String food, String sound, int hp) {
        super(name, level, type, food, sound, hp);
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " used inferno on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Grass pokemon loses 30 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 30;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Fire pokemon loses 10 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 10;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " pyroball on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Water pokemon loses 30 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 30;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Water pokemon loses 10 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 10;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " used firelash on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Water pokemon loses 30 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 30;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Water pokemon loses 20 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 20;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " used flamethrower on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Water pokemon loses 30 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 30;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Water pokemon loses 20 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 20;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
