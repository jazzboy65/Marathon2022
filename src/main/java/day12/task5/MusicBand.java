package day12.task5;

/*
  Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
  но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
  Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
  чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое, что и требовалось в 4 задании
  - слить две группы и проверить состав групп после слияния. Методы для слияния и для вывода участников в консоль
  необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
 */


import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private final List<MusicArtist> members;


    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public static void transferMembers(MusicBand m1, MusicBand m2) {
        m2.getMembers().addAll(m1.getMembers());

        m1.getMembers().clear();
    }


    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}


