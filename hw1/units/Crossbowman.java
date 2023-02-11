package java_oop.homework.hw1.units;

public class Crossbowman extends BaseHero{
    public Crossbowman(String name) {
        super(name, 110,70,8,15);
    }

    public Crossbowman(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }
}
