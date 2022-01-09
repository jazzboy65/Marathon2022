package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, countZero = 0, sumZero = 0;
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(10000);
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        System.out.println("Наибольший элемент массива: " + max);

        for (int num : arr) {
            if (num < min)
                min = num;
        }
        System.out.println("Наименьший элемент массива: " + min);

        for (int num : arr) {
            if (num % 10 == 0)
                countZero++;
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countZero);

        for (int num : arr) {
            if (num % 10 == 0)
                sumZero += num;
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumZero);
    }
}

