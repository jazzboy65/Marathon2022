package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boing",2000,1095,1000);
        Airplane a2 = new Airplane("Lochid",1995,500,500);
        Airplane.compareAirplanes(a1,a2);

    }
}