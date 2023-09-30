package day6;

public class Car {
    private String model;
    private String color;
    private int year;
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Модель: " + getModel() + " Цвет: " + getColor() + " Год выпуска: " + getYear();
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        return Math.abs(year - inputYear);
    }
}
