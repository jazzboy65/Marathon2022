package day11.task2;

public class Paladin extends Hero implements Healer{

    public Paladin() {
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health == 100) {
            return;
        }

        if (health == 0) {
            return;
        }
        if (health <= 75) {
            health+=25;
        }


    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health == 100) {
            return;
        }

        if(hero.health == 0) {
            return;
        }
        if (hero.health <=75) {
            hero.health += 25;
        }
        if (hero.health > 75) {
            hero.health = 100;
        }
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
