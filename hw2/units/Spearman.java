package java_oop.homework.hw2.units;

public class Spearman extends BaseHero{


    public Spearman(String name) {
        super(name,100,100,5,10);
    }

    @Override
    public String getInfo() {
        String info = String.format("Копейщик %s, скорость: %d", name,speed);
        return info;
    }

    @Override
    public void step() {

    }
}
