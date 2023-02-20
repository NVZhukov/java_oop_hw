package java_oop.homework.hw2;

import java_oop.homework.hw2.units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> heroes = new ArrayList<>();

        while (heroes.size() < 10) {
            switch (new Random().nextInt(7)) {
                case 0:
                    heroes.add(new Spearman(getName()));
                    break;
                case 1:
                    heroes.add(new Villager(getName()));
                    break;
                case 2:
                    heroes.add(new Monk(getName()));
                    break;
                case 3:
                    heroes.add(new Magician(getName()));
                    break;
                case 4:
                    heroes.add(new Sniper(getName()));
                    break;
                case 5:
                    heroes.add(new Bandit(getName()));
                    break;
                case 6:
                    heroes.add(new Crossbowman(getName()));
                    break;
            }
        }

        //default method
        //heroes.forEach(n -> System.out.println(n.getInfo(n.getName())));
        //method is different for everyone
        heroes.forEach(n -> System.out.println(n.getInfo()));
    }

    private static String getName(){
        return String.valueOf(NamesOfHero.values()[new Random().nextInt(NamesOfHero.values().length)]);
    }
}
