package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Kawasaki Ninja ZX-10R", "Green", 2017);
        System.out.println(motorbike);
    }
}
class Motorbike{
    private String model;
    private String color;
    private int dateRelease;

    public Motorbike(String model, String color, int dateRelease){
        this.model = model;
        this.color = color;
        this.dateRelease = dateRelease;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDateRelease(){
        return dateRelease;
    }
    @Override
    public String toString() {
        return "Модель: " + getModel() + " Цвет: " + getColor() + " Год выпуска: " + getDateRelease();
    }
}
