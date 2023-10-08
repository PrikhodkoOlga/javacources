package day11.task2;

public class Magician extends Hero implements MagicAttack{
    public Magician() {
        this.physAtt = 5;
        this.magicAtt = 20;
        this.magicDef = 0.8;
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
        return "Magician{health=" + health + "}";
    }
}
