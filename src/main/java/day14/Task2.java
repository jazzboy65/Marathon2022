package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");

        parseFileToStringList(file);

    }

    public static List<String> parseFileToStringList(File file) {

        List<String> people = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String person = sc.nextLine();

                String[] human = person.split(" ");

                if (Integer.parseInt(human[1]) < 0) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }

                people.add(person);
            }
            System.out.println(people);
            return people;


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
