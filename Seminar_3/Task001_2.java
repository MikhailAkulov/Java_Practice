// Дан список из 10 - 20 слов с повторами, вывести этот же спиок без повторов и указать сколько раз оно встречалось до изменения.


package Seminar_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task001_2 {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("bob", "ivan", "jon", "bob", "anna", "olga", "jon");
        for (Map.Entry<String, Integer> buf : transformer(collection).entrySet()) {
            System.out.println(buf.getKey() + " = " + buf.getValue());

        }
    }

    public static int count(List<String> start, String element) {
        int counter = 0;
        for (String string : start) {
            if (element.equals(string)) {
                counter++;
            }
        }
        return counter;
    }

    public static Map<String, Integer> transformer(List<String> start) {
        Map<String, Integer> collection = new HashMap<>();
        for (String string : start) {

            collection.put(string, count(start, string));
        }
        return collection;
    }
}