package java_oop.homework.hw4.units;

import java.util.ArrayList;

public class Villager extends BaseHero {


    public Villager(String name, int x, int y) {
        super(name, x, y, 1, 3, 1, 1, 1, 1);
    }

    @Override
    public String getInfo() {
        String info = String.format("Крестьянин %s, скорость: %d, (%d; %d)", name, speed,point.x,point.y);
        return info;
    }

    @Override
    public void step(ArrayList<BaseHero> enemy) {
    }

    @Override
    public void step() {

    }
}
