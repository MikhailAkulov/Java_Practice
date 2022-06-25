package Seminar_1;
// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
// Сводя количество выполняемых действий к минимуму. 

import java.util.Scanner;

public class Task001_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\n\nВведите число: ");
        int a = iScanner.nextInt();
        System.out.print("Введите степень числа: ");
        int b = iScanner.nextInt();
        iScanner.close();

        if (b == 0) {
            System.out.println("Число " + a + " в нулевой степени = 1");
        } else if (b == 1) {
            System.out.println("Число " + a + " ^ " + b + " = " + a + " .");
        } else {
            double c = a;
            for (int i = 1; i < Math.abs(b); i++) {
                c = c * a;
            }
            if (0 < b) {
                System.out.println("Число " + a + " ^ " + b + " = " + c + " .");
            }
            if (b < 0) {
                System.out.println("Число " + a + " ^ " + b + " = " + 1 / c + " .");
            }
        }

    }
}