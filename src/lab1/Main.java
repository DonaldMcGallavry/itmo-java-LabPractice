package lab1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("№1 \nЯ \nХорошо \nЗнаю \nJava.");

        System.out.println("№2");
        Task();

        System.out.println("№3");
        int number = 10500;
        double result = (((double)number/ 10)/10);
        System.out.println(result);

        System.out.println("№4");
        double result1 = 3.6 * 4.1 * 5.9;
        System.out.println(result1);

        System.out.println("№5");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("№6");
        Sycle();
    }
    public static void Task() {
        double S = (46 + 10) * ((double)10 / 3);
        double F =  (29) * (4) * (-15);

        System.out.println(S);
        System.out.println(F);
    }
    public static void Sycle(){
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        }
        else if (b % 2 == 0){
            System.out.println("Четное");
        }
        else if (b % 2 != 0){
            System.out.println("Нечетное");
        }
    }
}
