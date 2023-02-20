package java_oop.homework.hw3.units;

public abstract class Priest extends BaseHero{

    private int mana;

    public Priest(String name, int health, int speed, int minDamage, int maxDamage, int attack, int defence, int mana) {
        super(name, health, speed, minDamage, maxDamage, attack, defence);
        this.mana = mana;
    }
}
