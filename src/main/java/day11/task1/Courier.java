package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private static final int COUNT_SALARY = 100;
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

    public String toString() {
        return salary + "," + isPayed;
    }

    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    @Override
    public void doWork() {
        salary += COUNT_SALARY;
        warehouse.inCountDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;

    }
}
