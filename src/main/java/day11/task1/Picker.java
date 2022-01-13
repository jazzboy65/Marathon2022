package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private static final int COUNT_SALARY = 80;
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

    public String toString() {
        return salary + "," + isPayed;
    }

    public Picker(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    @Override
    public void doWork() {
        salary += COUNT_SALARY;
        warehouse.inCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
        }


}
