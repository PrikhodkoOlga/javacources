package day11.task1;

public class Courier implements Worker{
    private static final int DEFAULT_SALARY = 100;
    private static final int COUNT_DELIVERED_FOR_BONUS = 10000;
    private static final int BONUS_SIZE = 50000;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString(){
        return "Курьер имеет заработкую плату " + this.salary +
                ", был выплачен бонус " + this.isPayed;
    }
    public void doWork() {
        salary += DEFAULT_SALARY;
        warehouse.incrementCountDeliveredOrders();
    }
    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (warehouse.getCountDeliveredOrders() >= COUNT_DELIVERED_FOR_BONUS) {
            isPayed = true;
            salary += BONUS_SIZE;
        }
        else{
            System.out.println("Бонус пока не доступен");
        }
    }
}
