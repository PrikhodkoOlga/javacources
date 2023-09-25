package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double val1;
        double val2;
        int i = 1;
        while (i<=5){
            val1 = in.nextDouble();
            val2 = in.nextDouble();
            if (val2 == 0){
                System.out.println("Деление на 0");
                i++;
                continue;
            }
            System.out.println(val1 / val2);
            i++;

        }
    }
}
