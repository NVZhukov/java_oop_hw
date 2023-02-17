package java_oop.homework.hw2.units;

public class Magician extends BaseHero{

    private int mana;

    public Magician(String name) {
        super(name, 90,90,3,25);
        this.mana = 15;
    }

    public Magician(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }

    @Override
    public String getInfo() {
        String info = String.format("I'm %s %s, mana %d", this.getClass().getSimpleName(), name, mana);
        return info;
    }

    @Override
    public void step() {

    }
}
