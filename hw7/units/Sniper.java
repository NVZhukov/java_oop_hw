package java_oop.homework.hw7.units;

public class Sniper extends Archer {


    public Sniper(String name, int x, int y) {
        super(name, x, y, 60.f,60, 9, 3, 5, 10, 3, 22);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер: \t").append(java_oop.homework.hw7.units.Sniper.super.name)
                .append("\t\t| ATK:\t").append(java_oop.homework.hw7.units.Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.health)
                .append(" \t| Arrows:").append(java_oop.homework.hw7.units.Sniper.super.shot)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.point.x).append(".").append(Sniper.super.point.y);
    }

    @Override
    public String toString() {
        return "Снайпер "
                + super.toString()
                + " Shots:" + shot;
    }
}
