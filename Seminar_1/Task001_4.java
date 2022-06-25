package Seminar_1;

//+Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1
//Пример 4: а = 0, b = 0, ответ: не определено
//Пример 5
//входные данные находятся в файле input.txt в виде
//b 3
//a 10
//Результат нужно сохранить в файле output.txt
//1000

// НЕРАБОЧИЙ НАДО ДОПИЛИВАТЬ!!!

public class Task001_4 {
    public static void main(String[] args) {
        
        System.out.println(pow(3,2));
        System.out.println(pow(2,-2));
        System.out.println(pow(3,0));
        System.out.println(pow(0,0));

        System.out.println("-----");

        System.out.println(powRecursion(3,2));
        System.out.println(powRecursion(2,-2));
        System.out.println(powRecursion(3,0));
        System.out.println(powRecursion(0,0));

        System.out.println("-----");

        System.out.println(powIteration(3,2));
        System.out.println(powIteration(2,-2));
        System.out.println(powIteration(3,0));
        System.out.println(powIteration(0,0));


    }

    public static double pow(double number, int power) {
        double result = 1;
        if (number == 0 || number > 0 && power == 0) return 1;
        else if (number == 1) return 1;
        else if (number > 0 && power < 0) {
            number = 1 / number;
            power = -power;
        }
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        return result;
    }

    public static double powRecursion(double number, int power) {
        if (power == 0) return 1;
        if (power < 0) return powRecursion(1 / number, power * (-1));
        double result = powRecursion(number, power / 2);
        return power % 2 == 0 ? result * result : result * result * number;
//        if (power % 2 == 0) {
//            return result * result;
//
//        } else {
//            return result * result * number;
//        }
    }

    public static double powIteration(double number, int power) {
        double result = 1;
        if (number == 0 || number > 0 && power == 0) return 1;
        else if (number == 1) return 1;
        else if (number > 0 && power < 0) {
            number = 1 / number;
            power = -power;
        }
        while (power >= 0) {
            result *= number;
            power--;
        }
        return result;
    }
}