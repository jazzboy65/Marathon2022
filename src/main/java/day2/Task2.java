package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for (int i = a; i < b; i++) {
            if (i % 10 == 0) {
                continue;
            } else if (i % 5 == 0 && i != a && i != b) {
                System.out.print(i + " ");
            }
        }
    }
}
