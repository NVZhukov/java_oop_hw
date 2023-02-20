package java_oop_hw.hw2.units;

public class Spearman extends BaseHero{


    public Spearman(String name) {
        super(name,10,4,1,3,4,5);
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
