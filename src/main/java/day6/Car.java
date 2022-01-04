package day6;

public class Car {
    private String modelCar;
    private String colourOfCar;
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public Car() {
        this.modelCar = "Введите модель машины";
        this.colourOfCar = "Введите цвет машины";
    }

    public Car(String modelCar, String colourOfCar, int year) {
        this.modelCar = modelCar;
        this.colourOfCar = colourOfCar;
        this.year = year;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColourOfCar() {
        return colourOfCar;
    }

    public void setColourOfCar(String colourOfCar) {
        this.colourOfCar = colourOfCar;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        if(inputYear < 0) System.out.println("Введите корректный год");
        else  {
            inputYear = this.year - inputYear;
            System.out.print(inputYear);
        }
        return inputYear;
    }

    public void setYearOfCar(int yearOfCar) {
        this.year = yearOfCar;
    }
    void carInfoModel() {
        System.out.println("Модель машины: " + this.getModelCar());
    }
    void carInfoColour() {
        System.out.println("Цвет машины: " + this.getColourOfCar());
    }
    void carInfoYear() {
        System.out.println("Год машины: " + this.getYear());
    }
}

