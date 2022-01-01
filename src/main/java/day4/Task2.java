package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        int max = 0,min = 10000,countZero = 0,sumZero = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
            for (int num:arr) {
                if(num > max) {
                    max = num;
                }
                if(num < min) {
                    min = num;
                }
                if(num%10==0 || num ==0) {
                    countZero++;
                    sumZero+= num;
                }
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumZero);;


    }
}
