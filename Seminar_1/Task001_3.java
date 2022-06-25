package Seminar_1;

// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
// Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено 
// Комментарий: любое число в нулевой степени равно единице!

public class Task001_3 {

    public static void main(String[] args) {

        System.out.println(pow(3,2));
        System.out.println(pow(2,-2));
        System.out.println(pow(3,0));
        System.out.println(pow(0,0));

        System.out.println("-----");

        System.out.println(powReq(3,2));
        System.out.println(powReq(2,-2));
        System.out.println(powReq(3,0));
        System.out.println(powReq(0,0));

        System.out.println("-----");

        System.out.println(powIter(3,2));
        System.out.println(powIter(2,-2));
        System.out.println(powIter(3,0));
        System.out.println(powIter(0,0));


    }

    public static double pow(double num, int pow) {
        if (pow == 0 || num == 1) {
            return 1;
        }

        if (pow < 0) {
            pow = -pow;
            num = 1 / num;
        }

        double result = 1;

        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }

    public static double powReq(double num, int pow) {
        if (pow == 0) {
            return 1;
        }

        if (pow < 0) {
            return powReq(1 / num, -pow);
        }


        double result = powReq(num, pow / 2);

        return pow % 2 == 0 ? result * result : result * result * num;
    }

    public static double powIter(double num, int pow) {
        if (pow == 0) {
            return 1;
        }

        if (pow < 0) {
            pow = -pow;
            num = 1 / num;
        }

        double result = 1;

        while (pow > 0) {
            if (pow % 2 == 1) {
                result = result * num;
            }

            num = num*num;
            pow = pow/2;

        }

       return result;
    }

}