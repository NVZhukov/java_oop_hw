package java_oop.homework.hw5.units;

import java.util.ArrayList;

public class Magician extends Priest {


    public Magician(String name, int x, int y) {
        super(name, x, y, 50.f,50, 7, -6, -6, 9, 3, 5);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(java_oop.homework.hw5.units.Magician.super.name)
                .append("\t\t| ATK:\t").append(java_oop.homework.hw5.units.Magician.super.attack)
                .append("\t| HP:\t").append(Magician.super.health)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Magician.super.point.x).append(".").append(Magician.super.point.y);
    }

    @Override
    public void step(ArrayList<BaseHero> friend,ArrayList<BaseHero> enemy) {

    }

    @Override
    public void step() {

    }
}
