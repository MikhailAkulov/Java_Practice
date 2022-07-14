// Задача 1. 
// Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера),
// если будут дубликаты фамилий, то должны выводиться оба номера (если помним Map не может хранить дубликаты,
// будет заменять номер телефона по ключу, нужно подумать как не допустить такого)

package Home_work_3;

import java.util.*;

public class Task001_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> phones = new ArrayList<>();
        phones.add("123");
        phones.add("124");
        map.put("Ivanov", phones);

        phones = new ArrayList<>();
        phones.add("125");
        map.put("Petrov", phones);

        phones = new ArrayList<>();
        phones.add("222");
        phones.add("225");
        map.put("Sidorov", phones);

        for (Map.Entry<String, ArrayList<String>> item: map.entrySet()) {
            System.out.println(item.getKey()+":"+item.getValue());
        }
    }
}