package java_oop.homework.hw4.units;

public class Sniper extends Archer {


    public Sniper(String name, int x, int y) {
        super(name, x, y, 15, 9, 8, 10, 12, 10, 32);
    }

    @Override
    public String getInfo() {
        String info = String.format("Снайпер %s, скорость: %d, (%d; %d)", name, speed,point.x,point.y);
        return info;
    }

    @Override
    public void step() {

    }
}
