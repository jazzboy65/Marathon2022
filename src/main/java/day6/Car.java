package day6;

class Car {
    private String modelCar;
    private String colourOfCar;
    private int yearOfCar;

    public Car() {
        this.modelCar = "Введите модель машины";
        this.colourOfCar = "Введите цвет машины";
        this.yearOfCar = 0;
    }

    public Car(String modelCar, String colourOfCar, int yearOfCar) {
        this.modelCar = modelCar;
        this.colourOfCar = colourOfCar;
        this.yearOfCar = yearOfCar;
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

    public int getYearOfCar() {
        return yearOfCar;
    }

    void info() {
        System.out.print("Этот автомобиль ");
    }

    int yearDifference(int inputYear) {
        if(inputYear < 0) System.out.println("Введите корректный год");
        if (inputYear > 0) {
            inputYear = inputYear - this.yearOfCar;
            System.out.print(inputYear);
        }
        return inputYear;
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

