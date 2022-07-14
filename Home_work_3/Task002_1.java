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
        Auth(count);
    }

    public static void Auth(int n) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Login: ");
            String lCheck = sc.nextLine();
            String login = "admin";
            System.out.println("Password: ");
            String pCheck = sc.nextLine();
            String pass = "12345";
            if (lCheck.equals(login) && pCheck.equals(pass)) {
                System.out.println("You are logged in successfully");
            } else {
                throw new IOException("Login or password doesn't exist");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            if (n == 4) {
                System.out.println("Too many requests, wait for 15 seconds");
                Thread.sleep(15000);
            }
            if (n == 1) {
                System.out.println("System is blocked!");
                return;
            }
            Auth(n-1);
        }
    }
}
