package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("White");
        car.setModel("BMW");
        car.setDateRelease(2015);
        System.out.println(car);
    }
}
class Car{
    private String model;
    private String color;
    private int dateRelease;
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDateRelease(){
        return dateRelease;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    @Override
    public String toString() {
        return "Модель: " + getModel() + " Цвет: " + getColor() + " Год выпуска: " + getDateRelease();
    }
}
