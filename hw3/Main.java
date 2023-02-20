package java_oop_hw.hw2;

import java_oop_hw.hw2.units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> group1 = getListOfHero(1);
        ArrayList<BaseHero> group2 = getListOfHero(2);

        group1.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHealth() - o1.getHealth();

                return o2.getSpeed() - o1.getSpeed();
            }
        });
        group1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("-----------------------------------------------------");
        group2.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHealth() - o1.getHealth();

                return o2.getSpeed() - o1.getSpeed();
            }
        });
        group2.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("--------------------------------------------------------");
        ArrayList<BaseHero> allHero = new ArrayList<>(group1.size() + group2.size());
        allHero.addAll(group1);
        allHero.addAll(group2);

        allHero.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHealth() - o1.getHealth();

                return o2.getSpeed() - o1.getSpeed();
            }
        });

        allHero.forEach(n -> System.out.println(n.getInfo()));
    }

    public static ArrayList<BaseHero> getListOfHero(int group) {

        ArrayList<BaseHero> nameList = new ArrayList<>();
        if (group == 1) {
            while (nameList.size() < 10) {
                switch (new Random().nextInt(4)) {
                    case 0:
                        nameList.add(new Sniper(getName()));
                        break;
                    case 1:
                        nameList.add(new Villager(getName()));
                        break;
                    case 2:
                        nameList.add(new Bandit(getName()));
                        break;
                    case 3:
                        nameList.add(new Magician(getName()));
                        break;
                }
            }
        } else if (group == 2) {
            while (nameList.size() < 10) {
                switch (new Random().nextInt(4)) {
                    case 0:
                        nameList.add(new Crossbowman(getName()));
                        break;
                    case 1:
                        nameList.add(new Villager(getName()));
                        break;
                    case 2:
                        nameList.add(new Spearman(getName()));
                        break;
                    case 3:
                        nameList.add(new Monk(getName()));
                        break;
                }
            }
        }
        return nameList;
    }

    private static String getName() {
        return String.valueOf(NamesOfHero.values()[new Random().nextInt(NamesOfHero.values().length)]);
    }
}