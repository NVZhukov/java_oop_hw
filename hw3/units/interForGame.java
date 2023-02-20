package java_oop_hw.hw2.units;

public interface interForGame {

    default String getInfo(String name){
        String info = String.format("I'm %s %s", this.getClass().getSimpleName(), name);
        return info;
    }


    void step();
}
