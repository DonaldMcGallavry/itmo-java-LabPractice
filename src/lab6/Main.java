package lab6;

public class Main {
    public static void main(String[] args) {
        Client Ivan = new Client("Ivan", "Ivanov", "GSP");
        BankWorker Oleg = new BankWorker("oleg", "Borisov", "GSP");
        Ivan.print();
        Oleg.print();
        System.out.println("=============================");
        Truck truck = new Truck(2154, "IDN", 'W', 60, 5000, 8);
        truck.outPut();
        System.out.println("=============================");
        taskFourChild child = new taskFourChild();
        child.returnNumber();
        System.out.println("=============================");
        taskFiveChild child2 = new taskFiveChild();
        System.out.println(child2.getName());
        System.out.println("Вам " + child2.getAge() + " годиков!");
    }
}
