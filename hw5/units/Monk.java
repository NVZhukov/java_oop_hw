package java_oop.homework.hw5.units;

import java.util.ArrayList;

public class Monk extends Priest {


    public Monk(String name, int x, int y) {
        super(name, x, y, 50.f,50, 7, -7, -7, 10, 3, 5);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах: \t\t").append(java_oop.homework.hw5.units.Monk.super.name)
                .append("\t\t| ATK:\t").append(java_oop.homework.hw5.units.Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.health)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Monk.super.point.x).append(".").append(Monk.super.point.y);
    }

    @Override
    public void step(ArrayList<BaseHero> friend,ArrayList<BaseHero> enemy) {

    }

    @Override
    public void step() {

    }
}