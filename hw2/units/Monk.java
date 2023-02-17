package java_oop.homework.hw2.units;

public class Monk extends BaseHero{

    private int mana;

    public Monk(String name) {
        super(name, 90,80,3,20);
        this.mana = 10;
    }

    public Monk(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }

    @Override
    public String getInfo() {
        String info = String.format("I'm %s %s, mana %d", this.getClass().getSimpleName(), name,mana);
        return info;
    }

    @Override
    public void step() {

    }
}