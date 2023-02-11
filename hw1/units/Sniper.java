package java_oop.homework.hw1.units;

public class Sniper extends BaseHero{
    public Sniper(String name) {
        super(name, 110,70,8,15);
    }

    public Sniper(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }
}
