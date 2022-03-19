package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;


/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");
        List<String> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter("[.,:;()?!<>\"\\s–]+");
            while (sc.hasNext()) {
                list.add(sc.next());
            }

            Map<String, Long> map = list.stream().collect(Collectors.groupingBy(it -> it, Collectors.counting()));
            TreeMap<Long, String> revertedMap = new TreeMap<>(Comparator.reverseOrder());
            for (String key : map.keySet()) {
                revertedMap.put(map.get(key), key);
            }

            int i = 0;
            for (Long key : revertedMap.keySet()) {
                System.out.println(revertedMap.get(key) + " : " + key);
                i++;

                if (i == 100) {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
