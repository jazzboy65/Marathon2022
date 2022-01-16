package day11.task2;

public class Shaman extends Hero implements Healer{

    public Shaman() {
        this.physAtt = 10;
        this.magicAtt = 15;
        this.magicDef = 0.2;
        this.physDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health == 100) {
            return;
        }

        if (health == 0) {
            return;
        }
        if (health <= 50) {
            health+=50;
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
        if (hero.health <=70) {
            hero.health += 30;
        }
        if (hero.health > 70) {
            hero.health = 100;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
