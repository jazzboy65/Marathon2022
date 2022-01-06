package day8;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*long startTime1 = System.currentTimeMillis();

        int[] arr = new int[20001];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));*/
        StringBuilder sb = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sb.append(i).append(",");
        }
        System.out.println(sb);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));
    }
}
