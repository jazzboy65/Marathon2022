package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), count = a + 1;
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (count < b) {
            if (count % 5 == 0 && count % 10 != 0 && count!=a) System.out.print(count + " ");
            count++;


        }
    }
}
