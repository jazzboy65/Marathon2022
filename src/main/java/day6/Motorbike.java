package day6;


public class Motorbike {
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
        System.out.println();
        System.out.println("Модель мотоцикла: " + this.getModel() + "\nЦвет мотоцикла: " + this.getColour() + "\nГод выпуска мотоцикла: " + this.getYear());
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        if(inputYear < 0) System.out.println("Введите корректный год");
        if (inputYear > 0) {
            inputYear = this.YEAR - inputYear;
            System.out.print(inputYear);
        }
        return inputYear;
    }

}