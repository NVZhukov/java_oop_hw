package java_oop.homework.hw2.units;

public class Crossbowman extends BaseHero{

    private int numArrows;

    public Crossbowman(String name) {
        super(name, 110,70,8,15);
        this.numArrows = 10;
    }

    public Crossbowman(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }

    @Override
    public String getInfo() {
        String info = String.format("I'm %s %s, number of arrows %d", this.getClass().getSimpleName(), name, numArrows);
        return info;
    }

    @Override
    public void step() {

    }
}
