package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        createEvenList(0, 30, list);
        createEvenList(300, 350, list);
        System.out.println(list);
    }

    public static void createEvenList(int beginNum, int finishNum, List<Integer> list){
        for(int i = beginNum; i <= finishNum; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }
    }
}
