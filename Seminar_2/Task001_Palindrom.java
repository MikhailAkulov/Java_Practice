// Задача 1. Определите является ли строка полиндромом

package Seminar_2;

public class Task001_Palindrom {    
    public static void main(String[] args) {
    palindrome("KAZAK");
}

public static void palindrome(String string) {
    StringBuilder sb = new StringBuilder(string);
    String reverse_string = sb.reverse().toString();
    // System.out.println(reverse_string);
    if (string.equals(reverse_string)) {

        System.out.println("\nСтрока: " + reverse_string + " - является палиндромом.");
    } else
        System.out.println("\nСтрока: " + string + " - НЕ является палиндромом.");
}
}
