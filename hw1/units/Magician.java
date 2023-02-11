package java_oop.homework.hw1.units;

public class Magician extends BaseHero{
    public Magician(String name) {
        super(name, 90,90,3,25);
    }

    public Magician(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }
}
