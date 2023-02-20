package java_oop.homework.hw2.units;

public class Sniper extends BaseHero{


    public Sniper(String name) {
        super(name, 110,70,8,15);
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
