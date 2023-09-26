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
    public void setModel(String model){
        if (model.isEmpty())
            System.out.println("Некорректные данные при задании модели!!! Значение не может быть пустым");
        else
            this.model = model;
    }
    public void setColor(String color){
        if (color.isEmpty())
            System.out.println("Некорректные данные при задании цвета!!! Значение не может быть пустым");
        else
            this.color = color;
    }
    public void setDateRelease(int dateRelease){
        if (dateRelease < 1884)
            System.out.println("Некорректные данные при задании года выпуска!!! Самая старая машина в мире 1884 года выпуска");
        else if (dateRelease > java.time.LocalDateTime.now().getYear())
            System.out.println("Некорректные данные при задании года выпуска!!! Год выпуска не может быть больше текущего года");
        else
            this.dateRelease = dateRelease;
    }

    @Override
    public String toString() {
        return "Модель: " + getModel() + " Цвет: " + getColor() + " Год выпуска: " + getDateRelease();
    }
}
