package day11.task2;

public class Magician extends Hero implements MagicAttack{

    public Magician() {
        this.magicDef = 0.8;
        this.magicAtt = 20;
        this.physAtt = 5;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double magicAttackDamage = magicAtt * (1 - hero.magicDef);
        if(hero.health - magicAttackDamage < 0) {
            hero.health = 0;
        } else {
            hero.health -= magicAttackDamage;
        }


    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
