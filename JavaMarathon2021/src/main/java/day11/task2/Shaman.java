package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack{
    private static final int HEALER_HIMSELF = 50;
    private static final int HEALER_TEAMMATE = 30;
    public Shaman() {
        this.physAtt = 10;
        this.magicAtt = 15;
        this.magicDef = 0.2;
        this.physDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (this.health + HEALER_HIMSELF > MAX_HEALTH) {
            this.health = MAX_HEALTH;
        }
        else
            this.health +=HEALER_HIMSELF;

        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEALER_TEAMMATE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        }
        else
            hero.health +=HEALER_HIMSELF;

        System.out.println(hero);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.health == 0){
            System.out.println(hero);
            return;
        }

        double damageReceived = this.magicAtt * (1 - hero.magicDef);
        hero.health = hero.health < damageReceived ? 0 : (int) (hero.health - damageReceived);

        System.out.println(hero);
    }
    @Override
    public String toString() {
        return "Shaman{health=" + health + "}";
    }
}
