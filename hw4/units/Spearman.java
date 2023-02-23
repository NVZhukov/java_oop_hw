package java_oop.homework.hw4.units;

import java.util.ArrayList;

public class Spearman extends BaseHero {


    public Spearman(String name, int x, int y) {
        super(name, x, y, 10, 4, 1, 3, 4, 5);
    }

    @Override
    public String getInfo() {
        String info = String.format("Копейщик %s, скорость: %d, (%d; %d)", name, speed,point.x,point.y);
        return info;
    }

    @Override
    public void step(ArrayList<BaseHero> friend,ArrayList<BaseHero> enemy) {

    }

    @Override
    public void step() {

    }
}
