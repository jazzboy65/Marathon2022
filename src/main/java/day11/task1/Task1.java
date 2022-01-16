package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse w1 = new Warehouse();
        Picker picker = new Picker(w1);
        Courier courier = new Courier(w1);

        businessProcess(courier);
        businessProcess(picker);
        System.out.println(courier.getSalary());
        System.out.println(picker.getSalary());
        System.out.println(w1);

    }

    static void businessProcess(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}


