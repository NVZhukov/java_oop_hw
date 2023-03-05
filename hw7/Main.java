package java_oop.homework.hw7;

import java_oop.homework.hw7.units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int UNITS = 10;
    public static ArrayList<BaseHero> darkSide = getListOfHero(1);
    public static ArrayList<BaseHero> lightSide = getListOfHero(2);
    public static ArrayList<BaseHero> allHero = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        sc.nextLine();
        allHero.addAll(darkSide);
        allHero.addAll(lightSide);
        sortTeam(allHero);

        while (true) {
            View.view();
            sc.nextLine();
            for (BaseHero hero : allHero) {
                if (darkSide.contains(hero)) hero.step(darkSide, lightSide);
                else hero.step(lightSide, darkSide);
            }
            if (endGame(darkSide) == UNITS) {
                System.out.println("Победила светлая сторона!");
                break;
            }
            if (endGame(lightSide) == UNITS) {
                System.out.println("Победила темная сторона!");
                break;
            }
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

    static void sortTeam (ArrayList<BaseHero> team){
        team.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.getHealth() - o1.getHealth());
                return (int) (o2.getSpeed() - o1.getSpeed());
            }
        });
    }

    private static String getName() {
        return String.valueOf(NamesOfHero.values()[new Random().nextInt(NamesOfHero.values().length)]);
    }
}