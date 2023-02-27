package java_oop.homework.hw5;

import java_oop.homework.hw5.units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int UNITS = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<BaseHero> darkSide = getListOfHero(1);
        ArrayList<BaseHero> lightSide = getListOfHero(2);

        ArrayList<BaseHero> allHero = new ArrayList<>(darkSide.size() + lightSide.size());
        allHero.addAll(darkSide);
        allHero.addAll(lightSide);


        allHero.sort((o1, o2) -> {
            if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.getHealth() - o1.getHealth());
            return (int) (o2.getSpeed() - o1.getSpeed());
        });

        String stop = "";
        while (stop.equals("")) {
            for (BaseHero hero : allHero) {
                if (darkSide.contains(hero)) hero.step(darkSide, lightSide);
                else hero.step(lightSide, darkSide);
            }
            System.out.println("------------------------------");
            allHero.forEach(n -> System.out.println(n.getInfo()));
            System.out.println("------------------------------");
            if (endGame(darkSide) == UNITS) {
                System.out.println("Победила светлая сторона!");
                break;
            }
            if (endGame(lightSide) == UNITS) {
                System.out.println("Победила темная сторона!");
                break;
            }
            stop = sc.nextLine();
        }
        System.out.println("Игра окончена!");
    }

    public static ArrayList<BaseHero> getListOfHero(int group) {
        int startingPoint = 1;

        ArrayList<BaseHero> nameList = new ArrayList<>();
        if (group == 1) {
            while (nameList.size() < UNITS) {
                switch (new Random().nextInt(4)) {
                    case 0 -> nameList.add(new Sniper(getName(), 1, startingPoint));
                    case 1 -> nameList.add(new Villager(getName(), 1, startingPoint));
                    case 2 -> nameList.add(new Bandit(getName(), 1, startingPoint));
                    case 3 -> nameList.add(new Magician(getName(), 1, startingPoint));
                }
                startingPoint++;
            }
        } else if (group == 2) {
            while (nameList.size() < UNITS) {
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

    public static int endGame(ArrayList<BaseHero> team) {
        int count = 0;
        for (BaseHero hero : team) {
            if (hero.getHealth() ==  0 || hero.getInfo().toString().split(":")[0].equals("Фермер")) {
                count++;
            }
        }
        return count;
    }

    private static String getName() {
        return String.valueOf(NamesOfHero.values()[new Random().nextInt(NamesOfHero.values().length)]);
    }
}