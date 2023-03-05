package java_oop.homework.hw7.units;

import java.util.ArrayList;

public abstract class Warrior extends BaseHero {


    public Warrior(String name, int x, int y, float health, int maxHp, int speed, int minDamage, int maxDamage, int attack, int defence) {
        super(name, x, y, health, maxHp, speed, minDamage, maxDamage, attack, defence);
    }


    @Override
    public void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy) {
        if (state.equals("Die")) return;
        BaseHero opponent = enemy.get(findNearest(enemy));

        float damage = (opponent.defence - attack) > 0 ? minDamage : (opponent.defence - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;

        if (opponent.point.distanceToPlayer(getPoint(), opponent.getPoint()) < 2) {
            opponent.getDamage(damage);
        } else {
            Point2D temp = point.getDifPoints(opponent.getPoint());
            if (Math.abs(temp.x) < Math.abs(temp.y)) {
                if (temp.y > 0) getPoint().y--;
                else getPoint().y++;
            } else {
                if (temp.x > 0) getPoint().x--;
                else getPoint().x++;
            }
        }
    }
}
