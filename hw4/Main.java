package java_oop.homework.hw4;

import java_oop.homework.hw4.units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> group1 = getListOfHero(1);
        ArrayList<BaseHero> group2 = getListOfHero(2);

        ArrayList<BaseHero> allHero = new ArrayList<>(group1.size() + group2.size());
        allHero.addAll(group1);
        allHero.addAll(group2);

        allHero.sort((o1, o2) -> {
            if (o2.getSpeed() == o1.getSpeed()) return o2.getHealth() - o1.getHealth();
            return o2.getSpeed() - o1.getSpeed();
        });

        group1.forEach(n-> System.out.println(n.getInfo()));
        System.out.println("---------------------------------");
        group2.forEach(n-> System.out.println(n.getInfo()));
        System.out.println("---------------------------------");
        Sniper sniper = new Sniper("Ivan",1,8);
        sniper.step(group1,group2);
        System.out.println("---------------------------------");
        Crossbowman crossbowman = new Crossbowman("Den", 10,3);
        crossbowman.step(group2,group1);
    }

    public static ArrayList<BaseHero> getListOfHero(int group) {

        int startingPoint = 1;

        ArrayList<BaseHero> nameList = new ArrayList<>();
        if (group == 1) {
            while (nameList.size() < 10) {
                switch (new Random().nextInt(4)) {
                    case 0 -> nameList.add(new Sniper(getName(), 1, startingPoint));
                    case 1 -> nameList.add(new Villager(getName(), 1, startingPoint));
                    case 2 -> nameList.add(new Bandit(getName(), 1, startingPoint));
                    case 3 -> nameList.add(new Magician(getName(), 1, startingPoint));
                }
                startingPoint++;
            }
        } else if (group == 2) {
            while (nameList.size() < 10) {
                switch (new Random().nextInt(4)) {
                    case 0 -> nameList.add(new Crossbowman(getName(), 10, startingPoint));
                    case 1 -> nameList.add(new Villager(getName(), 10, startingPoint));
                    case 2 -> nameList.add(new Spearman(getName(), 10, startingPoint));
                    case 3 -> nameList.add(new Monk(getName(), 10, startingPoint));
                }
                startingPoint++;
            }
        }
        return nameList;
    }

    private static String getName() {
        return String.valueOf(NamesOfHero.values()[new Random().nextInt(NamesOfHero.values().length)]);
    }
}