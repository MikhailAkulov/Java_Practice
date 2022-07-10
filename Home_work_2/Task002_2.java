// Задача 2.
// Написать метод, который будет эмулировать работу динамического массива (Без исопользования коллекций),
// протестировать можно при выводе последовательности треугольного числа до n
//Пример
//1
//1 3
//1 3 6

package Home_work_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task002_2 {
    public static void main(String[] args) {
        int[] array = new int[0];
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
//        String stringNumber = input.nextLine();
//        int number = Integer.parseInt(stringNumber);  //Another way to read from console with the following conversion to int
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            result = (i * (i + 1)) / 2;
            array = arrayAppend(array, result);
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] arrayAppend(int[] array, int nextTriangularNumber) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
//        System.arraycopy(array, 0, newArray, 0, array.length); //Array copy with built-in method
        newArray[newArray.length - 1] = nextTriangularNumber;
        return newArray;
    }
}
