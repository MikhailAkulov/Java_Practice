// Задание 2.
// Написать метод, который будет эмулировать работу динамического массива (Без исопользования коллекций), 
// протестировать можно при выводе последовательности треугольного числа до n
// Пример
// 1
// 1 3
// 1 3 6

package Home_work_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("\n\nДо какого треугольного числа будем формировать массив? До: ");
        int triangleNum = Scanner.nextInt();
        Scanner.close();

        int[] array = new int[0]; // создаем изначальный массив

        for (int i = 1; i <= triangleNum; i++) {
            array = addMassive(array, i); // расширяем изначальный массив
            System.out.println(Arrays.toString(array));
        }

    }

    public static int Triangle(int num) { // вычисление треугольного числа
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }

    public static int[] addMassive(int[] array, int newElement) {
        int[] newArray = new int[array.length + 1]; // объявляем массив размерностью на единицу больше предыдущего
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = Triangle(newElement); // добавляем в новый массив новый элемент и возвращаем его
        return newArray;
    }
}
