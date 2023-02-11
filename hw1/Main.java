package java_oop.homework.hw1;

import java_oop.homework.hw1.units.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> heroes = new ArrayList<>();

        Spearman sr1 = new Spearman("Gladiator");
        heroes.add(sr1);
        Spearman sr2 = new Spearman("Vikaliy",150,90,10,20);
        heroes.add(sr2);
        Villager vl1 = new Villager("Stepan");
        heroes.add(vl1);
        Villager vl2 = new Villager("Ivan",100,70,5,5);
        heroes.add(vl2);
        Monk mk = new Monk("Sergiy");
        heroes.add(mk);
        Magician mg = new Magician("Voland",130,90,15,45);
        heroes.add(mg);
        Sniper sp = new Sniper("Tom Beket");
        heroes.add(sp);
        Bandit bt = new Bandit("Crime boss");
        heroes.add(bt);
        Crossbowman cb = new Crossbowman("Robin Gud");
        heroes.add(cb);

        for(BaseHero bh : heroes){
            bh.printInfo();
        }

        sr2.dealDamage(vl1);
        vl1.printInfo();
    }
}
