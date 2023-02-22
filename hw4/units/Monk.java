package java_oop.homework.hw4.units;

import java.util.ArrayList;

public class Monk extends Priest {


    public Monk(String name, int x, int y) {
        super(name, x, y, 30, 5, -4, -4, 12, 7, 1);
    }

    @Override
    public String getInfo() {
        String info = String.format("Монах %s, скорость: %d, (%d; %d)", name, speed,point.x,point.y);
        return info;
    }

    @Override
    public void step(ArrayList<BaseHero> bh) {

    }

    @Override
    public void step() {

    }
}