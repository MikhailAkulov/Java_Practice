// Написать программу перебора n комбинаций из цифр от 0 - 9 (n длина массива) те 0 0 0 0 0 1 0 0 2 - - - 9 9 9 n - длина одной строки

// НАДО ДОПИСЫВАТЬ!!!

package Seminar_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        
    }

    public static int GetNumber() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert size of array: ");
            int n = sc.nextInt();
            sc.close();
            return n;
        }
        
        catch (InputMismatchException e) {
            System.out.println("Try again!");
            GetNumber();
        }
        return 0;
    }
    public static int[] generateArray (int n) {
        int[] array = new int[n];
        if (array[0] == 0 && array[1] == 0 && )
    }
}
