import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GrassPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("leafstorm", "leechseed", "leaveblade", "solarbeam");

    public GrassPokemon (String name, int level, String type, String food, String sound, int hp) {
        super(name, level, type, food, sound, hp);
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used leafstorm on " + gymPokemon.getName());
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
            System.out.println("Fire pokemon loses 20 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 20;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }


    public List<String> leechSeed(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used leechseed on " + gymPokemon.getName());

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
        System.out.println("Fire pokemon loses 20 hp");
        int hp = gymPokemon.getHp();
        int newHp = hp - 20;
        gymPokemon.setHp(newHp);
        System.out.println(gymPokemon.getName() + " has hp of " + newHp);
    } else {
        System.out.println("Wrong attack");
    }

    public void leaveBlade (Pokemon pokemon, Pokemon gymPokemon){

            System.out.println(pokemon.getName() + " used leaveblade on " + gymPokemon.getName());
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
                System.out.println("Fire pokemon loses 20 hp");
                int hp = gymPokemon.getHp();
                int newHp = hp - 20;
                gymPokemon.setHp(newHp);
                System.out.println(gymPokemon.getName() + " has hp of " + newHp);
            } else {
                System.out.println("Wrong attack");
            }
    }



}

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " used solarbeam on " + gymPokemon.getName());
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
            System.out.println("Fire pokemon loses 20 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 20;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }
    public List<String> getAttacks(){return attacks;}

    }
