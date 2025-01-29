package lab6;

public class BankWorker extends Human {

    private String bankName;

    public BankWorker(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void print(){
        System.out.println("Имя: " + getName() + '\n' + "Фамилия: " + getSurname() + '\n' + "Название банка: " + bankName);
    }
}
