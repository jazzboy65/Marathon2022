package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("people");

        parseFileToObjList(file);

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {

                String x = sc.nextLine();

                String[] human = x.split(" ");

                if (Integer.parseInt(human[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                people.add(new Person(human[0], Integer.parseInt(human[1])));
            }

            System.out.println(people);
            return people;


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;

    }
}
