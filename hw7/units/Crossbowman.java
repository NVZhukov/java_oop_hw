package java_oop.homework.hw7.units;

public class Crossbowman extends Archer {


    public Crossbowman(String name, int x, int y) {
        super(name, x, y, 60.f, 60, 9, 3, 7, 7, 4, 20);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(java_oop.homework.hw7.units.Crossbowman.super.name)
                .append("\t\t| ATK:\t").append(java_oop.homework.hw7.units.Crossbowman.super.attack)
                .append("\t| HP:\t").append(Crossbowman.super.health)
                .append(" \t| Arrows:").append(Crossbowman.super.shot)
                .append("\t|").append("\t| (X.Y) : ").append(Crossbowman.super.point.x).append(".").append(Crossbowman.super.point.y);
    }

    @Override
    public String toString() {
        return "Арбалет "
                + super.toString()
                + " Shots:" + shot;
    }
}
