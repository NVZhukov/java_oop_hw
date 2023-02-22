package java_oop.homework.hw4.units;

public abstract class Priest extends BaseHero {

    private int mana;

    public Priest(String name, int x, int y, int health, int speed, int minDamage, int maxDamage, int attack, int defence, int mana) {
        super(name, x, y, health, speed, minDamage, maxDamage, attack, defence);
        this.mana = mana;
    }
}
