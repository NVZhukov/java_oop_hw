package java_oop.homework.hw2.units;

public class Crossbowman extends BaseHero{


    public Crossbowman(String name) {
        super(name, 110,70,8,15);
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
