package day11.task2;

public abstract class Hero implements PhysAttack{
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;
    int health;
    double physDef;
    double magicDef;
    int physAtt;
    int magicAtt;

    public Hero(){
        this.health = MAX_HEALTH;
    }

    public void physicalAttack(Hero hero) {
        if(hero.health == MIN_HEALTH) {
            System.out.println(hero);
            return;
        }

        double damageReceived = this.physAtt * (1 - hero.physDef);
        hero.health = hero.health < damageReceived ? MIN_HEALTH : (int) (hero.health - damageReceived);

        System.out.println(hero);
    }
}
