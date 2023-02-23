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
    public void step(ArrayList<BaseHero> enemy) {
        if (health == 0) System.out.printf("Игрок %s мертв", name);
        else if (shot == 0) System.out.println("Стрелы закончились((");

        ArrayList list = new ArrayList();

        enemy.forEach(n -> list.add(point2D.distanceToPlayer(this.getPoint(),n.getPoint())));

        int index = list.indexOf(Collections.min(list));
        enemy.get(index).printInfo();
        if(enemy.get(index).health <= (this.minDamage + this.maxDamage)/2){
            enemy.get(index).health = 0;
            System.out.printf("Игрок %s выбывает.", enemy.get(index).getName());
        }
        else {
            enemy.get(index).health -= (this.minDamage + this.maxDamage) / 2;
            System.out.printf("Игрок %s нанес урон %d игроку %s. Осталось HP: %d",this.name,
                    (this.minDamage + this.maxDamage) / 2,enemy.get(index).getName(),enemy.get(index).health);
        }

        //enemy.forEach(n -> n.printInfo());
    }
}
