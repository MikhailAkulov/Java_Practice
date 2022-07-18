// Задача 2. 
// Написать метод, который проверяет валидность логина и пароля (где нибудь в переменных сохраните)
// и при помощи конструкции try-catch рекурсивно принимайте данные (нужно ограничить колиичество попыток до 6
// и после 3 попытки должно быть сообщение, мол вы привысили количество попыток, немного пододождите
// тут можете поток заслипить на некоторое время. А когда попытки кончатся - выйти)

package Home_work_3;

import java.io.IOException;
import java.util.Scanner;

public class Task002_1 {
    public static void main(String[] args) throws InterruptedException {
        int count = 6;
        Authorization(count);
    }

    public static void Authorization(int n) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите Login: ");
            String lCheck = sc.nextLine();
            String login = "admin";
            System.out.println("Введите пароль: ");
            String pCheck = sc.nextLine();
            String pass = "00001111";
            if (lCheck.equals(login) && pCheck.equals(pass)) {
                System.out.println("Успешный вход");
            } else {
                throw new IOException("Неправильный логин или пароль");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            if (n == 4) {
                System.out.println("Много ошибочных вводов, подождте 15 секунд");
                Thread.sleep(15000);
            }
            if (n == 1) {
                System.out.println("Попытки закончились. Выход из системы");
                return;
            }
            Authorization(n-1);
        }
    }
}
