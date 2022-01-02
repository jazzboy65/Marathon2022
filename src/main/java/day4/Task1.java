package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        Random rand = new Random();
        int moreEight = 0;
        int equalsOne = 0;
        int even = 0;
        int notEven = 0;
        int sum = 0;
        for (int i = 0;i < x;i++) {
            arr[i] = rand.nextInt(10);

            sum += arr[i];
            if (arr[i] > 8) {
                moreEight++;
            }
            if (arr[i] == 1) {
                equalsOne++;
            }
            if (arr[i] % 2 == 0) {
                even++;
            }
            if (arr[i] % 2 != 0) {
                notEven++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива: " + x);
        System.out.println("Количество числе больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + notEven);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
