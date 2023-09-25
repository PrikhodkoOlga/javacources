package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 3;
        int m = 5;
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                array[i][j] = rand.nextInt(5);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int max = 0;
        int sumLine = 0;
        for (int i = 0; i < m; i++) {
            //for (int j = 0; j < n; j++)
            int sum = Arrays.stream(array[i]).sum();
            if (sum >= sumLine) {
                sumLine = sum;
                max = i;
            }
        }

        System.out.println("\n" + max);

    }
}
