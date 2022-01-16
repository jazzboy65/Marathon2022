package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    double magicDef;
    double physDef;
    int physAtt;
    int magicAtt;


    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double physAttackDamage = physAtt *(1 - hero.physDef);
        if (hero.health - physAttackDamage < 0) {
            hero.health = 0;
        } else {
            hero.health -= physAttackDamage;
        }
    }
}
