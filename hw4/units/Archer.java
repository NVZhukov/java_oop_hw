package java_oop.homework.hw4.units;

import java.util.ArrayList;

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

        enemy.forEach(n -> System.out.printf("Расстояние между %s(%d, %d) и %s(%d, %d) = %f\n",
                name,this.getPoint().x,this.getPoint().y,n.getName(),n.point.x,n.point.y,point2D.distanceToPlayer(this.getPoint(),n.getPoint())));
    }
}
