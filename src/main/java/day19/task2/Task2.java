package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");
        HashMap<Integer, Point> hashMap = new HashMap<>();

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                hashMap.put(sc.nextInt(), new Point(sc.nextInt(), sc.nextInt()));
            }

            Scanner input = new Scanner(System.in);
            System.out.println("Введите координаты x1,y1,x2,y2");
            int x1 = input.nextInt(),y1 = input.nextInt(),x2 = input.nextInt(),y2 = input.nextInt();

            for(Map.Entry<Integer, Point> coordinate: hashMap.entrySet()) {
                if(coordinate.getValue().getX() >= x1 && coordinate.getValue().getX() <= x2
                && coordinate.getValue().getY() >= y1 && coordinate.getValue().getY() <= y2) {

                    System.out.print(coordinate.getKey() + " ");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

