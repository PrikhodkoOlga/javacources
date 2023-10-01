package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 2000, 25000, 45000 );
        Airplane airplane2 = new Airplane("Boing", 2007, 30000, 55000 );
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}