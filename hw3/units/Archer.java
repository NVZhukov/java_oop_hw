package java_oop.homework.hw3.units;

public abstract class Archer extends BaseHero{

    private int shot;

    public Archer(String name, int health, int speed, int minDamage, int maxDamage, int attack, int defence, int shot) {
        super(name, health, speed, minDamage, maxDamage, attack, defence);
        this.shot = shot;
    }
}
