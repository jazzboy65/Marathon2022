package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != arr[99] || arr[j] != arr[98]) {
                    if (sum < arr[j] + arr[j + 1] + arr[j + 2]) {
                        sum = (arr[j] + arr[j + 1] + arr[j + 2]);
                        count = j;
                    } else break;
                }
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}




