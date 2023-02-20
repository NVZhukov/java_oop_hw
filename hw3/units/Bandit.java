package java_oop.homework.hw3.units;

public class Bandit extends BaseHero{

    public Bandit(String name) {
        super(name, 10,6,8,10,8,3);

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
