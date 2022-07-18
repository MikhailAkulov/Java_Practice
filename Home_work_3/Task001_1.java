// Задача 1. 
// Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера),
// если будут дубликаты фамилий, то должны выводиться оба номера (если помним Map не может хранить дубликаты,
// будет заменять номер телефона по ключу, нужно подумать как не допустить такого)

// ключ - фамилия

package Home_work_3;

import java.util.*;

public class Task001_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("123456");
        contacts.add("123457");
        map.put("Ivanov", contacts);

        contacts = new ArrayList<>();
        contacts.add("123458");
        map.put("Petrov", contacts);

        contacts = new ArrayList<>();
        contacts.add("123459");
        contacts.add("123450");
        map.put("Sidorov", contacts);

        for (Map.Entry<String, ArrayList<String>> item : map.entrySet()) {
            System.out.println(item.getKey() + ":" + item.getValue());
        }
    }
}