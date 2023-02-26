package java_oop.homework.hw5.units;

import java.util.ArrayList;

public abstract class Priest extends BaseHero {

    private int mana;

    public Priest(String name, int x, int y, float health, int maxHp, int speed, int minDamage, int maxDamage, int attack, int defence, int mana) {
        super(name, x, y, health, maxHp, speed, minDamage, maxDamage, attack, defence);
        this.mana = mana;
    }


    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        if (state.equals("Die") || mana == 0) return;
        for (BaseHero hero: friend) {
            if(hero.health < maxHp) hero.getDamage(maxDamage);
            mana = 0;
        }
    }
}
