package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("\nДлина массива: " + array.length);

        int countNumMoreEight = 0;
        int countUnit = 0;
        int countEven = 0;
        int countOdds = 0;
        for (int elem: array) {
            if (elem > 8)
                countNumMoreEight++;

            if (elem == 1)
                countUnit++;

            if (Math.floorMod(elem , 2) == 0)
                countEven++;
            else
                countOdds++;
        }
        System.out.println("Количество чисел больше 8: " + countNumMoreEight);
        System.out.println("Количество чисел равных 1: " + countUnit);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdds);
        System.out.println("Сумма всех элементов массива: " + Arrays.stream(array).sum());
    }
}
