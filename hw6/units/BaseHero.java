package java_oop.homework.hw6.units;

import java.util.ArrayList;

public abstract class BaseHero implements interForGame{
    protected String name;
    protected float health;
    protected int maxHp;
    protected int attack;
    protected int speed;
    protected int minDamage;
    protected int maxDamage;
    protected int defence;
    Point2D point = new Point2D();
    protected String state;

    public BaseHero(String name,int x, int y, float health,int maxHp, int speed, int minDamage, int maxDamage, int attack, int defence) {
        this.name = name;
        this.health = health;
        this.maxHp = maxHp;
        this.attack = attack;
        this.speed = speed;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.defence = defence;
        this.point.x = x;
        this.point.y = y;
        state = "Stand";
    }

    protected int findNearest(ArrayList<BaseHero> heroes){
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < heroes.size(); i++) {
            if (min > point.distanceToPlayer(getPoint(), heroes.get(i).getPoint()) && !heroes.get(i).state.equals("Die")){
                index = i;
                min = point.distanceToPlayer(getPoint(), heroes.get(i).getPoint());
            }
        }
        return index;
    }

    protected void getDamage(float damage){
        this.health -= damage;
        if(health <= 0){
            health = 0;
            state = "Die";
        }
        if (health > maxHp) health = maxHp;
    }

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(health) +
                " D:" + defence +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minDamage+maxDamage)/2)) +
                " " + state;
    }

    public String getName() {
        return name;
    }

    public float getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public Point2D getPoint() {
        return point;
    }

    public int[] getCoords() {return new int[]{point.x, point.y};}


    @Override
    public StringBuilder getInfo() {
        return new StringBuilder("");
    }

    public abstract void step(ArrayList<BaseHero> friend,ArrayList<BaseHero> enemy);
}
