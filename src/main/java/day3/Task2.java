package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double a = sc.nextDouble(), b = sc.nextDouble();
            if (b != 0) {
                System.out.println(a / b);
            } else break;
        }

    }}
