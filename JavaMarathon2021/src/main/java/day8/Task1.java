package day8;

public class Task1 {
    public static void main(String[] args) {
        int n = 20000;
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= n; i++){
            str += i + " ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
//        System.out.println(str);

        StringBuilder strBuilder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i <= n; i++){
            strBuilder.append(i).append(" ");
        }
        stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
//        System.out.println(strBuilder);
    }
}
