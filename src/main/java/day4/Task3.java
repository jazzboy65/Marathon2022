package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[12][8];
        int sumMax = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(50);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+= arr[i][j];
            }
            if(sumMax <= sum) {
                sumMax = sum;
                count = i;
            }
        }
        System.out.println(count);
    }
}



