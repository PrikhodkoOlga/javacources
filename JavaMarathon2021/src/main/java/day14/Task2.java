package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }
    public static List<String> parseFileToStringList(File file){
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)){

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                int age = Integer.parseInt(line.split(" ")[1]);
                if (age < 0)
                    throw new IllegalArgumentException("Некорректные данные");
                list.add(line);
            }
            return list;

        }catch (FileNotFoundException ex){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
