package java_oop.homework.hw6.units;

import java.util.ArrayList;

public interface interForGame {

    StringBuilder getInfo();

    void step(ArrayList<BaseHero> friend, ArrayList<BaseHero> enemy);
}
