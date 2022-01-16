package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane tu144 = new Airplane("Туполев", 2000, 1000, 100);
        tu144.setYear(2005);
        tu144.setLength(900);
        tu144.fillUp(100);
        tu144.fillUp(100);
        tu144.info();
    }
}

