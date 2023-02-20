package java_oop.homework.hw3.units;

public class Villager extends BaseHero{


    public Villager(String name) {
        super(name, 1,3,1,1,1,1);
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
