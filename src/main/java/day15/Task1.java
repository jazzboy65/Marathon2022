package day15;


import java.io.*;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        File outFile = new File("src/main/resources/missing_shoes.txt");

        try (Scanner sc = new Scanner(file); PrintWriter pw = new PrintWriter(outFile)) {

            while (sc.hasNext()) {
                String[] shoes = sc.nextLine().split(";");

                if (shoes.length != 3) {
                    throw new IllegalArgumentException("Количество столбцов не равно 3");
                }
                if (Integer.parseInt(shoes[2]) == 0) {
                    pw.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Входной файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
