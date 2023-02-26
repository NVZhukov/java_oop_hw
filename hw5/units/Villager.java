package java_oop.homework.hw5.units;

import java.util.ArrayList;

public class Villager extends BaseHero {


    public Villager(String name, int x, int y) {
        super(name, x, y, 1,1, 3, 1, 1, 1, 1);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(java_oop.homework.hw5.units.Villager.super.name)
                .append("\t\t| ATK:\t").append(java_oop.homework.hw5.units.Villager.super.attack)
                .append("\t| HP:\t").append(Villager.super.health)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Villager.super.point.x).append(".").append(Villager.super.point.y);
    }

    @Override
    public void step(ArrayList<BaseHero> friend,ArrayList<BaseHero> enemy) {
    }

    @Override
    public void step() {

    }
}
