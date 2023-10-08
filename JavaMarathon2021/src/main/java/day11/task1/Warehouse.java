package day11.task1;

public class Warehouse{
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int incrementCountPickedOrders() {
        return countPickedOrders++;
    }

    public int incrementCountDeliveredOrders() {
        return countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "На складе количество собранных заказов: " + this.countPickedOrders +
                ", количество доставленных заказов=: " + this.countDeliveredOrders;
    }
}
