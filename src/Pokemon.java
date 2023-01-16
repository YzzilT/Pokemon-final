import java.util.List;

public abstract class Pokemon {
    private final String name;
    private final int level;
    private final String type;
    private final String food;
    private final String sound;
    private int hp;

    public Pokemon(String name, int level, String type, String food, String sound, int hp) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.food = food;
        this.sound = sound;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public abstract List<String> getAttacks();


}
