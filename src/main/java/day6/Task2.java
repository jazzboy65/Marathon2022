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

class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + this.manufacturer + ", год выпуска: " + this.year + ", длина: "
                + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }

    int fillUp(int n) {
        if (n < 0) System.out.println("Введите положительное число");
        if (n >= 0) fuel += n;
        return fuel;

    }
}
