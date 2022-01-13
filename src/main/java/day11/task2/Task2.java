package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician mage = new Magician();
        Shaman shaman = new Shaman();
        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(mage);
        System.out.println(mage);
        shaman.healTeammate(mage);
        System.out.println(mage);
        mage.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(mage);
            System.out.println(mage);

        }

    }
}
