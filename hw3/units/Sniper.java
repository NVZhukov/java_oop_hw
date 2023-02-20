package java_oop.homework.hw3.units;

public class Sniper extends Archer{


    public Sniper(String name) {
        super(name, 15,9,8,10,12,10,32);
    }

    @Override
    public String getInfo() {
        String info = String.format("Снайпер %s, скорость: %d", name,speed);
        return info;
    }

    @Override
    public void step() {

    }
}
