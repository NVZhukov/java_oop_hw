package java_oop.homework.hw5.units;

import java.util.*;

public abstract class Archer extends BaseHero {

    protected int shot;

    public Archer(String name, int x, int y, float health,int maxHp, int speed, int minDamage, int maxDamage, int attack, int defence, int shot) {
        super(name, x, y, health, maxHp, speed, minDamage, maxDamage, attack, defence);
        this.shot = shot;
    }

    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {

        int index = findNearest(enemy);

        if (state.equals("Die") || shot == 0) return;

        if (enemy.get(index).health == 0) {
            index = findNearest(enemy);
        }
        float damage = (enemy.get(index).defence - attack)>0 ? minDamage : (enemy.get(index).defence - attack)<0 ? maxDamage : (minDamage + maxDamage)/2;
        enemy.get(index).getDamage(damage);

        for (BaseHero el : friend) {
            if (el.getInfo().toString().split(":")[0].equals("Фермер") && el.state.equals("Stand")) {
                System.out.printf("Крестьянин %s принес новую стрелу %s'y. Стрел осталось: %d\n", el.getName(), name, shot);
                el.state = "Busy";
                return;
            }
        }
        shot--;
        System.out.printf("У %s стрел осталось: %d\n", name,shot);
    }
}
