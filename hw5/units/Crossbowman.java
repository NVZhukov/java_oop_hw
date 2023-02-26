package java_oop.homework.hw5.units;

public class Crossbowman extends Archer{


    public Crossbowman(String name, int x, int y) {
        super(name,x,y, 10,10,4,2,3,6,3,16);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(java_oop.homework.hw5.units.Crossbowman.super.name)
                .append("\t\t| ATK:\t").append(java_oop.homework.hw5.units.Crossbowman.super.attack)
                .append("\t| HP:\t").append(Crossbowman.super.health)
                .append(" \t| Arrows:").append(Crossbowman.super.shot)
                .append("\t|").append("\t| (X.Y) : ").append(Crossbowman.super.point.x).append(".").append(Crossbowman.super.point.y);
    }

    @Override
    public void step() {

    }
}
