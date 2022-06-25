// Задача 2. Написать программу возрващающее число, 
// которе без остатка делится на сумма цифр этого числа.

import java.util.Random;

public class Task002 {


    public static void main(String[] args) {

        while (!NivenNumber()) {
        }
    }

    public static boolean NivenNumber() {
        int sumOfDigits = 0;
        Random random = new Random();
        double randomNumber = random.nextInt(2022);
        double number = randomNumber;
        while (number > 0) {
            sumOfDigits += (number % 10);
            number = number / 10;
        }
        double result = randomNumber / sumOfDigits;
        if (randomNumber % sumOfDigits != 0) {
            System.out.println("Число " + randomNumber + " - не число Нивена, т.к. % " + sumOfDigits + " = " + result);
            return false;
        } else {
            System.out.println("Число " + randomNumber + " - число Нивена, т.к. % " + sumOfDigits + " = " + result);
            return true;
        }
    }
}