package Seminar_3;

import java.util.*;

public class Lesson3 {
    static char[] chars;

    static List<Integer> position = new ArrayList<>();

    public static void main(String[] args) {
        int n = 3;

       generate(new int[n], 0, 10);

        /**
         * 0 0 0
         * 0 0 1
         * 0 0 2
         * - - -
         * 9 9 9
         *
         * 2? + 3? = 5?
         * */

        String str = "2? + 3? = 5?";

        str = str.replace(" ", "");
        chars = str.toCharArray();

        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] == '?'){
                position.add(i);
            }
        }
    }

    // замена вопросов на комбинации
    public static void check(int[] comb){
        for (int i = 0; i < comb.length; i++) {
            chars[position.get(i)] = Character.forDigit(comb[i],10);
        }
    }

    // рекурсивная генерация комбинаций
    public static void generate(int[] comb, int index, int n){

        if(comb.length == index){
            System.out.println(Arrays.toString(comb));
            check(comb);
            return;
        }

        for (int i = 0; i < n; i++) {
            comb[index] = i;
            generate(comb, index + 1, n);
        }
    }
}
