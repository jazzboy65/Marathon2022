package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");

        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner sc = new Scanner(file);

            String[] stringNumbers = sc.nextLine().split(" ");

            double sum = 0;

            for (String number : stringNumbers) {
                sum += Double.parseDouble(number);
            }

            String formattedDouble3 = new DecimalFormat("#0.000").format(sum / stringNumbers.length);

            System.out.print(sum / (double) stringNumbers.length);
            System.out.print(" --> " + formattedDouble3);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

