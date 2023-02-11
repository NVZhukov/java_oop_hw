package java_oop.homework.hw1.units;

public class Monk extends BaseHero{

    public Monk(String name) {
        super(name, 90,80,3,20);
    }

    public Monk(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }
}