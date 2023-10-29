package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            File fileIn = new File("JavaMarathon2021/src/main/resources/shoes.csv");
            Scanner scanner = new Scanner(fileIn);
            //File fileOut = new File();
            PrintWriter pw = new PrintWriter("JavaMarathon2021/src/main/resources/missing_shoes.txt");

            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(";");
                if ((line.length == 0) || (line.length != 3)){
                    throw new Exception();
                }
                if (Integer.parseInt(line[2]) == 0){
                    pw.println(line[0] + ", " + line[1] + ", " + line[2]);
                }
            }


            pw.close();
        }catch (FileNotFoundException ex){
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
