package day6;

public class Task1 {
    public static void main(String[] args) {
        Car toyota = new Car("Corolla","Dark blue",2000);
        toyota.info();
        toyota.yearDifference(2022);
        Motorbike bmw = new Motorbike("1000 RR","Black metal",2005);
        System.out.println();
        bmw.info();
        bmw.yearDifference(2022);
        bmw.motorbikeInfo();

    }
}
