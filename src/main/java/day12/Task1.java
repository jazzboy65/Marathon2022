package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();

        auto.add("BMW");
        auto.add("Audi");
        auto.add("Chrysler");
        auto.add("Mersedes");
        auto.add("Honda");

        System.out.println(auto);

        auto.add(2,"Maserati");
        auto.remove(5);

        System.out.println(auto);

    }
}
