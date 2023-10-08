package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        businessProcess(picker);
        System.out.println("ЗП сборщика " + picker.getSalary());
        System.out.println(warehouse);
        businessProcess(courier);
        System.out.println("ЗП курьер " + courier.getSalary());
        System.out.println(warehouse);

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse);
        Courier courier1 = new Courier(warehouse);
        picker1.doWork();
        System.out.println("ЗП сборщика " + picker1.getSalary());
        courier1.doWork();
        System.out.println("ЗП курьер " + courier1.getSalary());

        System.out.println(picker);
        System.out.println(courier);
        System.out.println(warehouse);
    }

    static void businessProcess(Worker worker){
        for(int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
