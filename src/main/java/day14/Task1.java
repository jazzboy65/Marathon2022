package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("test");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try {
            Scanner sc = new Scanner(file);

            String[] stringNumbers = sc.nextLine().split(" ");

            if (stringNumbers.length != 10) {
                throw new IllegalArgumentException("Некорректный входной файл");
            }

            int sum = 0;

            for (String number : stringNumbers) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


