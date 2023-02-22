package java_oop.homework.hw4.units;

import java.util.ArrayList;

public class Magician extends Priest {


    public Magician(String name, int x, int y) {
        super(name, x, y, 30, 9, -5, -5, 17, 12, 1);
    }

    @Override
    public String getInfo() {
        String info = String.format("Колдун %s, скорость: %d, (%d; %d)", name, speed,point.x,point.y);
        return info;
    }

    @Override
    public void step(ArrayList<BaseHero> enemy) {

    }

    @Override
    public void step() {

    }
}
