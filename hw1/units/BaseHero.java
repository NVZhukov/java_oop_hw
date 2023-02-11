package java_oop.homework.hw1.units;

public abstract class BaseHero {
    protected String name;
    protected int health;
    protected int endurance;
    protected int speed;
    protected int damage;


    public BaseHero(String name, int health, int endurance, int speed, int damage) {
        this.name = name;
        this.health = health;
        this.endurance = endurance;
        this.speed = speed;
        this.damage = damage;
    }

    public void printInfo(){
        System.out.printf("%s hp: %d end: %d speed: %d dmg: %d\n", name,health,endurance,speed,damage);
    }

    public boolean dealDamage(BaseHero bh){
        int attack = bh.getHealth() - this.damage;
        if(attack <= 0){
            System.out.printf("Игрок %s выбывает...\n", bh.getName());
            return false;
        }
        else {
            System.out.printf("%s нанес урон %d игроку %s\n", this.name, this.damage, bh.getName());
            bh.setHealth(attack);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
