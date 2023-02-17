package java_oop.homework.hw2.units;

public class Spearman extends BaseHero{

    private int numOfStep;

    public Spearman(String name) {
        super(name,100,100,5,10);
        this.numOfStep = numOfStep;
    }

    public Spearman(String name, int health, int endurance, int speed, int damage) {
        super(name, health, endurance, speed, damage);
    }

    @Override
    public String getInfo() {
        String info = String.format("I'm %s %s, can move at %d steps", this.getClass().getSimpleName(), name, numOfStep);
        return info;
    }

    @Override
    public void step() {

    }
}
