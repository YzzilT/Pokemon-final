import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ElectricPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("electroball", "thunderpunch", "thunder", "volttackle");

    public ElectricPokemon (String name, int level, String type, String food, String sound, int hp){
        super(name, level, type, food, sound, hp);
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used electroball on " + gymPokemon.getName());
       if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
           System.out.println("Electric pokemon loses 10 hp");
           int hp = gymPokemon.getHp();
           int newHp = hp -10;
           gymPokemon.setHp(newHp);
           System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

       } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
           System.out.println("Water pokemon loses 40 hp");
           int hp = gymPokemon.getHp();
           int newHp = hp - 40;
           gymPokemon.setHp(newHp);
           System.out.println(gymPokemon.getName() + " has hp of " + newHp);

       } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
           System.out.println("Water pokemon loses 30 hp");
           int hp = gymPokemon.getHp();
           int newHp = hp - 30;
           gymPokemon.setHp(newHp);
           System.out.println(gymPokemon.getName() + " has hp of " + newHp);
       } else {
           System.out.println("Wrong attack");
       }

    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used thunderpunch on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon loses 10 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -10;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Water pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Water pokemon loses 30 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 30;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used thunder on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon gets 20 hp boost");
            int hp = gymPokemon.getHp();
            int newHp = hp +20;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Water pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Water pokemon loses 30 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 30;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);
        } else {
            System.out.println("Wrong attack");
        }
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " used volttackle on " + gymPokemon.getName());
        if (Objects.equals(gymPokemon.getType(), "ElectricPokemon")){
            System.out.println("Electric pokemon loses 10 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -10;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "WaterPokemon")){
            System.out.println("Water pokemon loses 50 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp -50;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "GrassPokemon")) {
            System.out.println("Grass pokemon loses 40 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 40;
            gymPokemon.setHp(newHp);
            System.out.println(gymPokemon.getName() + " has hp of " + newHp);

        } else if (Objects.equals(gymPokemon.getType(), "FirePokemon")) {
            System.out.println("Fire pokemon loses 30 hp");
            int hp = gymPokemon.getHp();
            int newHp = hp - 30;
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
