// Задача 1. У вас есть отсортированный массив (Можете сами сгенерировать и использовать любой удобный вам алгоритм сортировки 
// (кроме пузырька)), нужно используя минимальное колличество попыток найти загаданное число (Алгоритм бинарного поиска )

package Home_work_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task001_1 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.print("\nУкажите количество элементов массива: ");
        int n = Scanner.nextInt();
        int[] arr = new int[n];
        Scanner.close();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }

        int indexToFind = new Random().nextInt(n);

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

        System.out.println("-------------------------------------------------------------------");

        System.out.printf("Индекс искомого числа: %d", indexToFind);

        System.out.println("\nМинимальное колличество попыток для нахождения загаданного числа: "
                + BinarySearch(arr, indexToFind, 1, n));
    }

    public static int BinarySearch(int[] arr, int key, int low, int high) { // метод бинарного поиска

        int count = 0;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] == key) {
                break;
            }
            count += 1;
        }
        return count;
    }

}
