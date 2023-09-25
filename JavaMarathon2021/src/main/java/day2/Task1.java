package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        System.out.print("Ввведите количество этажей: ");
        Scanner in = new Scanner(System.in);
        int countFloors = in.nextInt();
        if (countFloors >=1 && countFloors <=4){
            System.out.println("Малоэтажный дом");
        }
        else if (countFloors >=5 && countFloors <=8){
            System.out.println("Среднеэтажный дом");
        }
        else if (countFloors >=9){
            System.out.println("Многоэтажный дом");
        }
        else{
            System.out.println("Ошибка ввода");
        }

        in.close();
    }
}
