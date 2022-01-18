package day12.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>(Arrays.asList(
                new MusicBand("Bon Jovi",1983),
                new MusicBand("Nirvana", 1967),
                new MusicBand("Radiohead", 1985),
                new MusicBand("Red Hot Chili Peppers",1983),
                new MusicBand("Linkin Park",1986),
                new MusicBand("Limp Bizkit",1996),
                new MusicBand("Via Gra",2000),
                new MusicBand("Звери", 2001),
                new MusicBand("Valravn",2005),
                new MusicBand("MBAND",2014),
                new MusicBand("Tesla boy",2008)));

        Collections.shuffle(musicBands);

        groupsAfter2000(musicBands);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
        System.out.println(musicBands);

        musicBands = musicBands.stream().filter(it -> it.getYear() > 2000).collect(Collectors.toList());

        System.out.println(musicBands);
        return musicBands;
    }
}
