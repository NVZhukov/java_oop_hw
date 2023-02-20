package java_oop.homework.hw2.units;

public class Bandit extends BaseHero{


    public Bandit(String name) {
        super(name, 120,80,5,10);
        this.endurance = 15;
    }


    @Override
    public String getInfo() {
        String info = String.format("Разбойник %s, скорость: %d", name,speed);
        return info;
    }

    @Override
    public void step() {

    }
}
