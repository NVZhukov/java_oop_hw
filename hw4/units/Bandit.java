package java_oop.homework.hw4.units;

import java.util.ArrayList;

public class Bandit extends BaseHero {

    public Bandit(String name, int x, int y) {
        super(name, x, y, 10, 6, 8, 10, 8, 3);
    }

    @Override
    public String getInfo() {
        String info = String.format("Разбойник %s, скорость: %d, (%d; %d)", name, speed,point.x,point.y);
        return info;
    }

    @Override
    public void step(ArrayList<BaseHero> friend,ArrayList<BaseHero> enemy) {

    }

    @Override
    public void step() {

    }
}
