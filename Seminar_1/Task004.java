package Seminar_1;

// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class Task004 {
    public static void main(String[] args) {
        int n = 4; // количество дисков
        System.out.println("Задано дисков: " + n + " и 3 стержня. \nАлгоритм: ");
        move(n, 1, 3); // 1,2,3 -номера стержней
    }

    public static void move(int n, int start, int end) {
        if (n == 0) {
            return;
        }
        int intermediate = 6 - start - end;
        move(n - 1, start, intermediate);
        System.out.println("Перемещаем диск " + n + " со стержня " + start + " на стержень " + end);
        move(n - 1, intermediate, end);
    }
}