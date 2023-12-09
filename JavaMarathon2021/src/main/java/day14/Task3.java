package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }
    public static List<Person> parseFileToObjList(File file){
        List<Person> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] linesArray = line.split(" ");
                if (Integer.parseInt(linesArray[1]) < 0)
                    throw new IllegalArgumentException("Некорректный входной файл");

                list.add(new Person(linesArray[0], Integer.parseInt(linesArray[1])));
            }
            scanner.close();
            return list;

        }catch (FileNotFoundException ex){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
