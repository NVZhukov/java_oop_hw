package java_oop.homework.hw1.units;

public class Villager extends BaseHero{
    public Villager(String name) {
        super(name, 120,90,5,5);
    }

    public Villager(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }
}
