package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2000, 25000, 45000 );
        airplane.setLength(30000);
        airplane.setYear(2010);
        airplane.fillUp(1500);
        System.out.println("Количество топлива: " + airplane.getFuel());
        airplane.fillUp(500);
        System.out.println("Количество топлива: " + airplane.getFuel());
        airplane.info();
    }
}
