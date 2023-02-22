package java_oop.homework.hw4.units;

public class Crossbowman extends Archer{


    public Crossbowman(String name, int x, int y) {
        super(name,x,y, 10,4,2,3,6,3,16);
    }

    @Override
    public String getInfo() {
        String info = String.format("Арбалетчик %s, скорость: %d, (%d; %d)", name, speed,point.x,point.y);
        return info;
    }

    @Override
    public void step() {

    }
}
