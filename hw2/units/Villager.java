package java_oop.homework.hw2.units;

public class Villager extends BaseHero{

    private int endurance;

    public Villager(String name) {
        super(name, 120,90,5,5);
        this.endurance = 5;
    }

    public Villager(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }

    @Override
    public String getInfo() {
        String info = String.format("I'm %s %s, endurance %d", this.getClass().getSimpleName(), name, endurance);
        return info;
    }

    @Override
    public void step() {

    }
}
