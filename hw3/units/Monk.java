package java_oop_hw.hw2.units;

public class Monk extends Priest{


    public Monk(String name) {
        super(name, 30,5,-4,-4,12,7,1);
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