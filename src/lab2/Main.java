package lab2;

public class Main {
    public static void main(String[] args) {
    Calculator cal = new Calculator();
    System.out.println("Сложение int - " + cal.Sum(100,13));
    System.out.println("Сложение long - " + cal.Sum(111111111111111111L,111111111111111111L));
    System.out.println("Сложение double - " + cal.Sum(156.45,18.246));
    System.out.println("del" + cal.Div(2, 0));


    BankAccount bank = new BankAccount("Boris","Hren_Popadesh", 880055535, 42);
    System.out.println(bank);
    }
}
