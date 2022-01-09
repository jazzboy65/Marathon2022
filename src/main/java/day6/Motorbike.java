package day6;


public class Motorbike {
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
        System.out.println();
        System.out.println("Модель мотоцикла: " + this.getModel() + "\nЦвет мотоцикла: " + this.getColour() + "\nГод выпуска мотоцикла: " + this.getYear());
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }

}
