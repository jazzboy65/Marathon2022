package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        MusicBand m1 = new MusicBand("Bon Jovi", 1983,members1);

        members1.add(new MusicArtist("Jon BonJovi",53));
        members1.add(new MusicArtist("David Bryan",67));
        members1.add(new MusicArtist("Tico Torres",67));
        members1.add(new MusicArtist("Phil X",59));
        members1.add(new MusicArtist("Hugh McDonald",68));

        List<MusicArtist> members2 = new ArrayList<>();

        MusicBand m2 = new MusicBand("Ария", 1985,members2);


        members2.add(new MusicArtist("Валерий Кипелов",67));
        members2.add(new MusicArtist("Михаил Житняков",70));

        MusicBand.transferMembers(m1,m2);
        m1.printMembers();
        m2.printMembers();


    }
}
