package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carsList = new ArrayList<>(Arrays.asList("BMW", "Audi", "Lada", "Ford", "Subaru"));
        System.out.println(carsList);

        carsList.add(3, "Mitsubishi");
        carsList.remove(0);
        System.out.println("Новый список:\n" + carsList);
    }
}
