package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10000);
        }
        for (int elem: array) {
            System.out.print(elem + " ");
        }
        int max = array[0];
        int min = array[0];
        int countEndZero = 0;
        int sumEndZero = 0;
        for (int elem: array) {
            if (elem > max)
                max = elem;
            else if (elem < min)
                min = elem;

            if (Math.floorMod(elem , 10) == 0){
                countEndZero++;
                sumEndZero +=elem;
            }
        }
        System.out.println("\nНаибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countEndZero);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sumEndZero);

    }
}
