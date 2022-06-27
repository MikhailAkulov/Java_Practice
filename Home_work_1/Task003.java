// Задача 3. Разобрать Task2 из репозитория (ссылка во вложениях) и составить схему итераций программы 
// (Пример: https://prnt.sc/_Ix6_yGvB6T9) прислать либо скрином, либо фото из тетрадки, либо ссылкой.

//Пример 1: а = 1, b = 7, c = 1, d = 2
//- команда 1 (к1): а + c
//- команда 2 (к2): a * d

public class Task003 {
    public static void main(String[] args) {
        generate(1,7,1,2,"");
    }

    public static void  generate (int source, int target, int c, int d, String path){
        if (source > target) return;
        if(source == target){
            System.out.println(path);
            return;
        }

        generate(source + c, target,c,d,path + " k1");
        generate(source * d, target,c,d,path + " k2");

    }
}