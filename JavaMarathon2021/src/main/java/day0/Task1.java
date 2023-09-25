package day0;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        List<String> list = new ArrayList<>();
        list.add("Март");
        list.add("Сентябрь");
        list.add("Январь");
        list.add("Ноябрь");
        list.add("Май");
        list.add("Февраль");
        list.add("Июнь");
        list.add("Октябрь");
        list.add("Июль");
        list.add("Апрель");
        list.add("Декабрь");
        list.add("Август");
        Collections.sort(list, new Comparator<String>() {
            private int getMonthNum(String month){
                switch (month) {
                    case "Январь":
                        return 1;
                    case "Февраль":
                        return 2;
                    case "Март":
                        return 3;
                    case "Апрель":
                        return 4;
                    case "Май":
                        return 5;
                    case "Июнь":
                        return 6;
                    case "Июль":
                        return 7;
                    case "Август":
                        return 8;
                    case "Сентябрь":
                        return 9;
                    case "Октябрь":
                        return 10;
                    case "Ноябрь":
                        return 11;
                    case "Декабрь":
                        return 12;

                }
                return -1;
            }
            @Override
            public int compare(String o1, String o2) {
                int firstMonthNum = getMonthNum(o1);
                int secondMonthNum = getMonthNum(o2);
                if (firstMonthNum != -1 && secondMonthNum != -1){
                    if (firstMonthNum > secondMonthNum)
                        return 1;
                    else if (firstMonthNum < secondMonthNum)
                        return -1;
                    else return 0;
                }
                return 0;
            }
        });
        System.out.print(list.toString());
    }
}
