package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileIn = new File("JavaMarathon2021/src/main/resources/shoes1.csv");
        try(Scanner scanner = new Scanner(fileIn);
            PrintWriter pw = new PrintWriter("JavaMarathon2021/src/main/resources/missing_shoes.txt")){
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(";");
                if ((line.length == 0) || (line.length != 3)){
                    throw new IllegalArgumentException("Некорректный входной файл");
                }
                if (Integer.parseInt(line[2]) == 0){
                    pw.println(line[0] + ", " + line[1] + ", " + line[2]);
                }
            }
        }catch (FileNotFoundException ex){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
