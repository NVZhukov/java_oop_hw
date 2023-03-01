package java_oop.homework.hw6.units;

import java.util.ArrayList;

public abstract class Priest extends BaseHero {

    protected int mana;

    public Priest(String name, int x, int y, float health, int maxHp, int speed, int minDamage, int maxDamage, int attack, int defence, int mana) {
        super(name, x, y, health, maxHp, speed, minDamage, maxDamage, attack, defence);
        this.mana = mana;
    }


    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        if (state.equals("Die") || mana == 0) return;
        BaseHero wounded = friend.get(findWounded(friend));
        wounded.getDamage(maxDamage);
        mana--;
    }

    protected int findWounded(ArrayList<BaseHero> heroes){
        double min = 0;
        int index = 0;
        for (int i = 0; i < heroes.size(); i++) {
            if (min < heroes.get(i).maxHp - heroes.get(i).health & !heroes.get(i).state.equals("Die")){
                index = i;
                min = heroes.get(i).maxHp - heroes.get(i).health;
            }
        }
        return index;
    }
}
