package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("fileTest.txt");
        printSumDigits(file);
    }
    public static void printSumDigits(File file) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersArray = line.split(" ");
            if (numbersArray.length != 10 )
                throw new Exception();
            int sum = 0;

            for (String elem: numbersArray) {
                sum += Integer.parseInt(elem);
            }
            System.out.println(sum);

        }catch (FileNotFoundException ex){
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
