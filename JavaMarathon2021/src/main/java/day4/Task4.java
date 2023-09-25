package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(10);
        }

        for (int i = 0; i < array.length; i++)  {
                System.out.print(array[i] + " ");
        }

        int maxSum = array[0];
        int currSum = 0;
        int numElem = 0;
        for (int i = 0; i < array.length - 2; i++) {
            currSum = array[i] + array[i+1] + array[i+ 2];
            if (currSum > maxSum){
                maxSum = currSum;
                numElem = i;
            }
        }

        System.out.println("\n" + maxSum + "\n" + numElem);

    }
}
