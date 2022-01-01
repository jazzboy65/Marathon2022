package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        Random rand = new Random();
        int y = 0;
        int moreEight = 0;
        int equalsOne = 0;
        int even = 0;
        int notEven = 0;
        int sum = 0;
        for (int num : arr) {
            y = rand.nextInt(10);

            sum += y;
            if (y > 8) {
                moreEight++;
            }
            if (y == 1) {
                equalsOne++;
            }
            if (y % 2 == 0) {
                even++;
            }
            if (y % 2 != 0) {
                notEven++;
            }
        }
        System.out.println("Длина массива: " + x);
        System.out.println("Количество числе больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + notEven);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
