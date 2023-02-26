package java_oop.homework.hw5.units;

public abstract class Priest extends BaseHero {

    private int mana;

    public Priest(String name, int x, int y, float health, int maxHp, int speed, int minDamage, int maxDamage, int attack, int defence, int mana) {
        super(name, x, y, health, maxHp, speed, minDamage, maxDamage, attack, defence);
        this.mana = mana;
    }
}
