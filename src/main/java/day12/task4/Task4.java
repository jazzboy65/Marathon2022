package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();

        MusicBand m1 = new MusicBand("Bon Jovi", 1983,members1);

        members1.add("Jon BonJovi");
        members1.add("David Bryan");
        members1.add("Tico Torres");
        members1.add("Phil X");
        members1.add("Hugh McDonald");

        List<String> members2 = new ArrayList<>();

        MusicBand m2 = new MusicBand("Ария", 1985,members2);


        members2.add("Валерий Кипелов");
        members2.add("Михаил Житняков");


        MusicBand.transferMembers(m1,m2);
        m1.printMembers();
        m2.printMembers();


    }


}

