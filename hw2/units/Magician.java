package java_oop.homework.hw2.units;

public class Magician extends BaseHero{


    public Magician(String name) {
        super(name, 90,90,3,25);
    }

    @Override
    public String getInfo() {
        String info = String.format("Колдун %s, скорость: %d", name,speed);
        return info;
    }

    @Override
    public void step() {

    }
}
