package day11.task2;

public class Paladin extends Hero implements Healer{
    private static final int HEALER_HIMSELF = 25;
    private static final int HEALER_TEAMMATE = 10;
    public Paladin() {
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
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
    public String toString() {
        return "Paladin{health=" + health + "}";
    }
}
