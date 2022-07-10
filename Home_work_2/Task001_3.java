// Задача 1. 
// У вас есть отсортированный массив (Можете сами сгенерировать и использовать любой удобный вам алгоритм сортировки 
// (кроме пузырька)), нужно используя минимальное колличество попыток найти загаданное число (Алгоритм бинарного поиска )

package Home_work_2;

import java.util.Arrays;
import java.util.Random;

public class Task001_3 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        int indexToFind = 3;

        System.out.println("\nМассив случайных чисел:");
        for (int el : arr) {
            System.out.print(el + " ");
        }

        Arrays.sort(arr);
        System.out.println("\nОтсортированный вид массива:");
        for (int el : arr) {
            System.out.print(el + " ");
        }

        int toFind = arr[indexToFind];
        System.out.println("\nИскомое число: " + toFind);
        
        int min = 0;
        int max = arr.length - 1;
        int index = 1;
        if (arr[min] == toFind) {
            indexToFind = min;
        } else if (arr[max] == toFind) {
            indexToFind = max;
        } else {
            while (arr[indexToFind] != toFind) {
                if (toFind > arr[indexToFind]) {
                    min = indexToFind;
                    indexToFind = (max + indexToFind) / 2;
                } else {
                    max = indexToFind;
                    indexToFind = (min + indexToFind) / 2;
                }
                index++;
            }
        }
        System.out.printf("\nИскомое значение %d находится на %d индексе.\nПотребовалось %d итераций", toFind, indexToFind, index);

    }
    
}
