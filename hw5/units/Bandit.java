package java_oop.homework.hw5.units;

import java.util.ArrayList;

public class Bandit extends BaseHero {

    public Bandit(String name, int x, int y) {
        super(name, x, y, 70.f,70, 6, 2, 6, 10, 7);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(java_oop.homework.hw5.units.Bandit.super.name)
                .append("\t\t| ATK:\t").append(java_oop.homework.hw5.units.Bandit.super.attack)
                .append("\t| HP:\t").append(Bandit.super.health)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Bandit.super.point.x).append(".").append(Bandit.super.point.y);
    }

    @Override
    public void step(ArrayList<BaseHero> friend,ArrayList<BaseHero> enemy) {

    }

    @Override
    public void step() {

    }
}
