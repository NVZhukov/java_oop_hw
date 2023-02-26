package java_oop.homework.hw5.units;

import java.util.ArrayList;

public class Spearman extends BaseHero {


    public Spearman(String name, int x, int y) {
        super(name, x, y, 10,10, 4, 1, 3, 4, 5);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик: \t").append(java_oop.homework.hw5.units.Spearman.super.name)
                .append("\t\t| ATK:\t").append(java_oop.homework.hw5.units.Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.health)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.point.x).append(".").append(Spearman.super.point.y);
    }

    @Override
    public void step(ArrayList<BaseHero> friend,ArrayList<BaseHero> enemy) {

    }

    @Override
    public void step() {

    }
}
