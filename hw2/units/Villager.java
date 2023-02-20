package java_oop.homework.hw2.units;

public class Villager extends BaseHero{


    public Villager(String name) {
        super(name, 120,90,5,5);
    }

    @Override
    public String getInfo() {
        String info = String.format("Крестьянин %s, скорость: %d", name,speed);
        return info;
    }

    @Override
    public void step() {

    }
}
