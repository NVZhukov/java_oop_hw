package java_oop.homework.hw2.units;

public class Monk extends BaseHero{


    public Monk(String name) {
        super(name, 90,80,3,20);
    }

    @Override
    public String getInfo() {
        String info = String.format("Монах %s, скорость: %d", name,speed);
        return info;
    }

    @Override
    public void step() {

    }
}