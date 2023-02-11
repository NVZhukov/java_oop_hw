package java_oop.homework.hw1.units;

public class Bandit extends BaseHero{
    public Bandit(String name) {
        super(name, 120,80,5,10);
    }

    public Bandit(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }
}
