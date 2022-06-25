package Seminar_1;

/* Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
Сводя количество выполняемых действий к минимуму. 
Пример 1: а = 3, b = 2, ответ: 9 
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5
входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000
*/

// НЕРАБОЧИЙ НАДО ДОПИЛИВАТЬ!!!

import java.util.Scanner;

public class Task001_5 {
    public static void main(String[] arg) {

    }

    public static double pow(double num, int pow){

        if(pow == 0 && num == 0)
            System.out.println("не определено");
        
        if(pow == 0 || num == 1){
            return 1;
        }
        
        if (pow < 0){
            pow = -pow;
            num = 1/num;
        }

        double result = 1;

        for (int i = 0; i < pow; i++) {
            result *=num;
        }
        return result;
    }

}
