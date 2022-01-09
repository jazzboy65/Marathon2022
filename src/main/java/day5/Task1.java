package day5;

public class Task1 {
    public static void main(String[] args) {
        Car bmv = new Car();
        bmv.setModelCar("x5");
        bmv.setColourOfCar("Black");
        bmv.setYearOfCar(1998);
        bmv.carInfoModel();
        bmv.carInfoColour();
        bmv.carInfoYear();
    }
}

class Car{
    private String modelCar;
    private String colourOfCar;
    private int yearOfCar;

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

    public int getYearOfCar() {
        return yearOfCar;
    }

    public void setYearOfCar(int yearOfCar) {
        this.yearOfCar = yearOfCar;
    }
    void carInfoModel() {
        System.out.println("Модель машины: " + this.getModelCar());
    }
    void carInfoColour() {
        System.out.println("Цвет машины: " + this.getColourOfCar());
    }
    void carInfoYear() {
        System.out.println("Год машины: " + this.getYearOfCar());
    }
}

