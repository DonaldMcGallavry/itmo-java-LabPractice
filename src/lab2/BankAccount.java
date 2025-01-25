package lab2;

public class BankAccount {
    private String First_name;
    private String Second_name;
    private int number;
    private double amount;

public BankAccount(){
    First_name = "Nikita";
    Second_name = "Dubskiy";
    number = 456756;
    amount = 100000;
}

public BankAccount(String First_name, String Second_name, int number, double amount){
    this.First_name = First_name;
    this.Second_name = Second_name;
    this.amount = amount;
    this.number = number;
}

    @Override
    public String toString() {
        return "BankAccount{" +
                "First_name='" + First_name + '\'' +
                ", Second_name='" + Second_name + '\'' +
                ", number=" + number +
                ", amount=" + amount +
                '}';
    }
}
