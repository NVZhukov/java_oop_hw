package java_oop_hw.hw2.units;

public class Crossbowman extends Archer{


    public Crossbowman(String name) {
        super(name, 10,4,2,3,6,3,16);
    }

    @Override
    public String getInfo() {
        String info = String.format("Арбалетчик %s, скорость: %d", name,speed);
        return info;
    }

    @Override
    public void step() {

    }
}
