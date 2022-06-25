package Seminar_1;

// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
// Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено 
// Комментарий: любое число в нулевой степени равно единице!
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt

// НЕРАБОЧИЙ НАДО ДОПИЛИВАТЬ!!!

import java.util.Scanner;

public class Task001_2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("\n\nВведите число: ");
        int a = Scanner.nextInt();
        System.out.print("Введите степень числа: ");
        int b = Scanner.nextInt();
        Scanner.close();

        System.out.println(a + " ^ " + b + " = " + pow(a, b));
    }

    public static double pow(int a, int b) {
        double c = 1;
        if (b == 0) {
            return c;
        }
        if (b == 1) {
            return a;
        }
        for (int i = 1; i < Math.abs(b); i++) {
            c *= a;
        }
        if (b < 0) {
            return 1 / c;
        }
        if (0 < b) {
            return c;
        }
        return c;
    }
}