// Задача 1. У вас есть отсортированный массив (Можете сами сгенерировать и использовать любой удобный вам алгоритм сортировки 
// (кроме пузырька)), нужно используя минимальное колличество попыток найти загаданное число (Алгоритм бинарного поиска )

package Home_work_2;

import java.util.Scanner;

public class Task001_2 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.print("\n\nБудем формировать массив от 1 до: ");
        int max_massive = Scanner.nextInt();
        System.out.print("\n\nКакое число в промежутке от 1 до " + max_massive + " будем угадывать: ");
        int searh = Scanner.nextInt();
        Scanner.close();

        System.out.println("Количество попыток, минимально необходимых для угадывания: "
                + BinarySearch(massive(max_massive), searh, 1, max_massive));
    }

    public static int BinarySearch(int[] sortedArray, int key, int low, int high) { // функция бинарного поиска

        int count = 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                break;
            }
            count += 1;
        }
        return count;
    }

    public static int[] massive(int max_massive) { // формируем массив последовательных чисел от 1 до введенного
                                                   // пользователем
        int[] mas = new int[max_massive];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
        }
        return mas;
    }
    
}
