package java_oop_hw.hw2.units;

public class Magician extends Priest{


    public Magician(String name) {
        super(name, 30,9,-5,-5,17,12,1);
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
