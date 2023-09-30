package day6;



public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("White");
        car.setModel("BMW");
        car.setYear(2020);
        car.info();
        int inputYearCar = 2010;
        System.out.println("Год выпуска автомобиля " + car.getYear() + ", год для сравнения " + inputYearCar +". Разница: " + car.yearDifference(inputYearCar));

        Motorbike motorbike = new Motorbike("Kawasaki Ninja ZX-10R", "Green", 2017);
        motorbike.info();
        int inputYearMotorbike = 2015;
        System.out.println("Год выпуска мотоцикла " + motorbike.getYear() + ", год для сравнения " + inputYearMotorbike +". Разница: " + motorbike.yearDifference(inputYearMotorbike));
    }
}
