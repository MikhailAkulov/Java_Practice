// Задача 1. 
// Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера),
// если будут дубликаты фамилий, то должны выводиться оба номера (если помним Map не может хранить дубликаты,
// будет заменять номер телефона по ключу, нужно подумать как не допустить такого)

// ключ - номер телефона

package Home_work_3;

import java.util.HashMap;
import java.util.Map;

public class Task001_2 {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("123456", "Ivanov");
        contacts.put("123457", "Ivanov");
        contacts.put("123458", "Petrov");
        contacts.put("123459", "Sidorov");
        contacts.put("123450", "Sidorov");

        printBook(contacts);
        System.out.println("--------------------------------------------");
        printBook(contacts, "Sidorov");
    }

    public static void printBook(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("Surname: %s, \tphone number: %s\n", entry.getValue(), entry.getKey());
        }
    }

    public static void printBook(HashMap<String, String> map, String name) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue() == name) {
                System.out.printf("Surname: %s, \tphone number: %s\n", entry.getValue(), entry.getKey());
            }
        }
    }
}
