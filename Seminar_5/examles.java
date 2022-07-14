// package Seminar_5;

// public class examles {
    
// }


// public static void main(String... args)
// {
// 	final double max = 100.; // Максимальное число для диапазона от 0 до max
// 	final double rnd = rnd(max);

// 	System.out.println("Псевдослучайное вещественное число: " + rnd);
// }

// /**
//  * Метод получения псевдослучайного вещественного числа от 0 до max (исключая max);
//  */
// public static double rnd(final double max)
// {
// 	return Math.random() * max;
// }

// public static void main(String... args)
// {
// 	final int min = 10; // Минимальное число для диапазона
// 	final int max = 75; // Максимальное число для диапазона
// 	final int rnd = rnd(min, max);

// 	System.out.println("Псевдослучайное целое число: " + rnd);
// }

// /**
//  * Метод получения псевдослучайного целого числа от min до max (включая max);
//  */
// public static int rnd(int min, int max)
// {
// 	max -= min;
// 	return (int) (Math.random() * ++max) + min;
// }

// Map<Integer,String> map = new HashMap<>();
//        map.put(11, "один один");
//        map.put(2, "два");
//        map.put(1, "один");
//        System.out.println(map);
