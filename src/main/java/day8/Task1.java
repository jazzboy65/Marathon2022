package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();

        String numbers = "";
        for (int i = 0; i <=20000; i++) {
            numbers += i + " ";
        }
        System.out.println(numbers);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));
        StringBuilder sb = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(",");
        }
        System.out.println(sb);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));
    }
}
