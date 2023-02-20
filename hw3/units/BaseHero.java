package java_oop.homework.hw3.units;

public abstract class BaseHero implements interForGame{
    protected String name;
    protected int health;
    protected int attack;
    protected int speed;
    protected int minDamage;
    protected int maxDamage;
    protected int defence;


    public BaseHero(String name, int health, int speed, int minDamage, int maxDamage, int attack, int defence) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.defence = defence;


    }

    public void printInfo(){
        System.out.printf("%s hp: %d speed: %d min dmg: %d max dmg: %d attack: %d defence: %d\n",
                name,health,speed,minDamage, maxDamage,attack,defence);
    }

//    public boolean dealDamage(BaseHero bh){
//        int attack = bh.getHealth() - this.damage;
//        if(attack <= 0){
//            bh.setHealth(attack);
//            System.out.printf("Игрок %s выбывает...\n", bh.getName());
//            return false;
//        }
//        else {
//            System.out.printf("%s нанес урон %d игроку %s\n", this.name, this.damage, bh.getName());
//            bh.setHealth(attack);
//            return true;
//        }
//    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract String getInfo();
}
