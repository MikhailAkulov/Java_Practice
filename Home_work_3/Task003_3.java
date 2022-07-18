// Задача 3. (Задача №4 из дока)
// https://docs.google.com/document/d/14rZuh8e2pTupzzjsG9M2QYTB09GbALYuy7dUHIz4RKA/edit
// https://habr.com/ru/post/200758/ (в статье все прекрасно объясняется)
//
// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

package Home_work_3;

public class Task003_3 {
    public static void main(String[] args) {
        hanoi(4, 1, 2);
    }

    public static void hanoi(int n, int i, int k) {
        if (n == 1) {
            System.out.printf("Перемещаем диск %d со стержня %d на стержень %d.\n", n, i, k);
        } else {
            int tmp = 6 - i - k;
            hanoi(n - 1, i, tmp);
            System.out.printf("Перемещаем диск %d со стержня %d на стержень %d.\n", n, i, k);
            hanoi(n - 1, tmp, k);
        }

    }
}
