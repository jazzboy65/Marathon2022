package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            count++;
            double a = sc.nextDouble(), b = sc.nextDouble();
            switch ((int) b) {
                case 0:
                    System.out.println("Деление на 0");
                    continue;
                default:
                    System.out.println(a / b);
                    continue;
            }
        }
    }

}

