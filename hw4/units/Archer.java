package java_oop.homework.hw4.units;

import java.util.*;

public abstract class Archer extends BaseHero {

    private int shot;
    Point2D point2D = new Point2D();

    public Archer(String name, int x, int y, int health, int speed, int minDamage, int maxDamage, int attack, int defence, int shot) {
        super(name, x, y, health, speed, minDamage, maxDamage, attack, defence);
        this.shot = shot;
    }

    @Override
    public void step(ArrayList<BaseHero> friend,ArrayList<BaseHero> enemy) {
        ArrayList list = new ArrayList();
        enemy.forEach(n -> list.add(point2D.distanceToPlayer(this.getPoint(), n.getPoint())));

        int index = list.indexOf(Collections.min(list));
        enemy.get(index).printInfo();

        if (health == 0) {
            System.out.printf("Игрок %s мертв", name);
        } else if (shot == 0) {
            System.out.println("Нечем стрелять((");
        } else {
            if (enemy.get(index).health <= (minDamage + maxDamage) / 2) {
                enemy.get(index).health = 0;
                System.out.printf("Игрок %s выбывает. HP: %d\n", enemy.get(index).getName(), enemy.get(index).health);
            } else {
                enemy.get(index).health -= (minDamage + maxDamage) / 2;
                System.out.printf("Игрок %s нанес урон %d игроку %s. Осталось HP: %d\n", name,
                        (minDamage + maxDamage) / 2, enemy.get(index).getName(), enemy.get(index).health);
            }

            for (Object el : friend) {
                if (el.getClass().getSimpleName().equals("Villager")) {
                    System.out.printf("Крестьянин %s принес новую стрелу %s'y. Стрел осталось: %d\n", ((BaseHero) el).getName(), name, shot);
                    break;
                } else {
                    shot--;
                    System.out.printf("Свободных крестьян нет! Стрел осталось: %d\n", shot);
                    break;
                }
            }
        }
    }
}
