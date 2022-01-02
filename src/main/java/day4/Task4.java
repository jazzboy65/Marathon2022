package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        int count = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
            for (int i = 0; i < arr.length - 2; i++) {
                int sum = 0;
                for (int j = i; j < i + 3; j++) {
                    sum += arr[j];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                    count = i;
                }
            }
        System.out.println(maxSum);
        System.out.println(count);
    }
}




