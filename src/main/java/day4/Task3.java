package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[12][8];
        int sumMax = 0, sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum >= sumMax) {
                sumMax = sum;
                count = i;
            }
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(50);
                sum += arr[i][j];
            }
        }
        System.out.println(sumMax);
        System.out.println(count + " - Индекс строки, сумма чисел в которой максимальна");
    }
}

