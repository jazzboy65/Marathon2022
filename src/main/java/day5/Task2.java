package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike yamaha = new Motorbike("GXR","black",2000);
        yamaha.motorbikeInfo();
    }
}

class Motorbike {
    private final String model;
    private final String colour;
    private final int year;

    public Motorbike(String model, String colour, int year) {
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }
    void motorbikeInfo() {
        System.out.println("Модель мотоцикла: " + this.getModel() + "\nЦвет мотоцикла: " + this.getColour() + "\nГод выпуска мотоцикла: " + this.getYear());
    }

}
