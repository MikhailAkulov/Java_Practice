// Задача 3. (Задача №4 из дока)
// https://docs.google.com/document/d/14rZuh8e2pTupzzjsG9M2QYTB09GbALYuy7dUHIz4RKA/edit
// https://habr.com/ru/post/200758/ (в статье все прекрасно объясняется)
//
// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

package Home_work_3;

public class Task003_2 {
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
