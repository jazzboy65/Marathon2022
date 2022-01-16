package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel +
                '}';
    }

    public int getLength() {
        return length;
    }

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

    public void fillUp(int n) {
        fuel += n;
    }
    public static void compareAirplanes(Airplane a1,Airplane a2) {
        if(a1.length > a2.length) {
            System.out.print("Первый самолет длиннее");
        }
        if(a2.length > a1.length) {
            System.out.print("Второй самолет длиннее");
        }
        if(a1.length == a2.length) {
            System.out.print("Длины самолетов равны");
        }

        System.out.println();
    }


}
