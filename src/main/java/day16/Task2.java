package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File outputFile1 = new File("src/main/file1.txt");
        File outputFile2 = new File("src/main/file2.txt");

        Random random = new Random();

        printResult(outputFile2);

        try {
            PrintWriter pw1 = new PrintWriter(outputFile1);

            for (int i = 0; i < 1000; i++) {
                pw1.println(random.nextInt(100));
            }

            pw1.close();

            Scanner sc1 = new Scanner(outputFile1);
            PrintWriter pw2 = new PrintWriter(outputFile2);

            int counter = 0;
            int sum = 0;

            while (sc1.hasNext()) {
                sum += sc1.nextInt();
                counter++;

                if (counter == 20) {
                    pw2.println(sum / 20.0);

                    sum = 0;
                    counter = 0;
                }
            }

            pw2.close();


        } catch (FileNotFoundException e) {
            System.out.println("Выходной файл не создан");
        }
    }

    public static void printResult(File file) {

        try {
            Scanner sc2 = new Scanner(file);

            double result = 0;

            while (sc2.hasNext()) {
                result += Double.parseDouble(sc2.next());
            }

            System.out.println((int) result);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}