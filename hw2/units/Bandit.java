package java_oop.homework.hw2.units;

public class Bandit extends BaseHero{

    private int endurance;

    public Bandit(String name) {
        super(name, 120,80,5,10);
        this.endurance = 15;
    }

    public Bandit(String name, int health, int endurance, int speed, int damage) {
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
