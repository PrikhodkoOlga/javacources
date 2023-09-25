package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double val1 = in.nextDouble();
        double val2 = in.nextDouble();
        while (true){
            if (val2 == 0){
                break;
            }
            System.out.println(val1 / val2);

            val1 = in.nextDouble();
            val2 = in.nextDouble();
        }
    }
}
