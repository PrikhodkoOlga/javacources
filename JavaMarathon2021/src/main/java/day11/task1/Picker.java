package day11.task1;

public class Picker implements Worker{
    private static final int DEFAULT_SALARY = 80;
    private static final int COUNT_ORDERS_FOR_BONUS = 10000;
    private static final int BONUS_SIZE = 70000;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString(){
        return "Сборщик имеет заработкую плату " + this.salary +
                ", был выплачен бонус " + this.isPayed;
    }

    @Override
    public void doWork() {
        salary += DEFAULT_SALARY;
        warehouse.incrementCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == true){
            System.out.println("Бонус уже был выплачен");
            return;
        }

        if (warehouse.getCountPickedOrders() >= COUNT_ORDERS_FOR_BONUS){
            isPayed = true;
            salary += BONUS_SIZE;
        }
        else{
            System.out.println("Бонус пока не доступен");
        }
    }
}
