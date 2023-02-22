package java_oop.homework.hw4.units;

import java.util.ArrayList;

public abstract class Archer extends BaseHero {

    private int shot;

    public Archer(String name, int x, int y, int health, int speed, int minDamage, int maxDamage, int attack, int defence, int shot) {
        super(name, x, y, health, speed, minDamage, maxDamage, attack, defence);
        this.shot = shot;
    }

    @Override
    public void step(ArrayList<BaseHero> bh) {

    }
}
