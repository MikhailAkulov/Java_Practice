package Another_Tasks;

// 2. Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b). 
// Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка, 
// но при этом не делятся на 10 без остатка. Например, число 15 подходит под наше условие 
// (делится на 5 без остатка и не делится на 10 без остатка), но число 20 не подходит под наше условие 
// (делится на 5 без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
// Если a >= b вывести сообщение "Некорректный ввод".

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\nВведите число a: ");
        int a = iScanner.nextInt();
        System.out.print("Введите число b: ");
        int b = iScanner.nextInt();
        iScanner.close();

        if (a >= b) {
            System.out.println("Ошибка ввода");
        }

        for (int index = a + 1; index < b; index++) {
            if (index % 5 == 0 && index % 10 != 0) {
                System.out.println(index);
            }
        }
    }
}