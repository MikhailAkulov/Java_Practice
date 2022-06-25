package Seminar_1;

// На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить в "с" раза, "а" умножается на "c"
// - команда 2 (к2): увеличить на "d" ( +2 ), к "a" прибавляется "d"

// Написать программу, которая выдаёт набор команд, позволяющий число "a" превратить в число "b" 
// или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// * Подумать над тем, как сделать минимальное количество команд

import java.util.Scanner;

public class Task002_2 {
    public static void main(String[] args) {
        // вводим числа с клавиатуры
        Scanner Scanner = new Scanner(System.in);
        System.out.print("\n\nВведите число 'a': ");
        int a = Scanner.nextInt();
        System.out.print("Введите число 'b': ");
        int b = Scanner.nextInt();
        System.out.print("Введите число 'с' ('а' умножается на 'с'): ");
        int c = Scanner.nextInt();
        System.out.print("Введите число 'd' ('d' прибавляется к 'a'): ");
        int d = Scanner.nextInt();
        Scanner.close();
        if (b < a) {
            System.out.println("нет решения");
        } else {
            path(a, b, c, d, "" + a);
        }

    }

    public static void path(int a, int b, int c, int d, String path) {
        if (b < a) {
            return;
        }
        if (a == b) {
            System.out.println(path);
            return;
        }
        path(a * c, b, c, d, (path + " * " + c));
        path(a + d, b, c, d, (path + " + " + d));

    }

}