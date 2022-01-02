package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike yamaha = new Motorbike("GXR","black",2000);
        yamaha.motorbikeInfo();
    }
}

class Motorbike {
    private final String MODEL;
    private final String COLOUR;
    private final int YEAR;

    public Motorbike(String model, String colour, int year) {
        this.MODEL = model;
        this.COLOUR = colour;
        this.YEAR = year;
    }

    public String getModel() {
        return MODEL;
    }

    public String getColour() {
        return COLOUR;
    }

    public int getYear() {
        return YEAR;
    }
    void motorbikeInfo() {
        System.out.println("Модель мотоцикла: " + this.getModel() + "\nЦвет мотоцикла: " + this.getColour() + "\nГод выпуска мотоцикла: " + this.getYear());
    }

}
