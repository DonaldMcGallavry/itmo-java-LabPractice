package lab6;

public class Client extends Human {

    private String bName;

    public Client(String name, String surname, String bName){
        super(name, surname);
        this.bName = bName;
    }

    @Override
    public void print(){
    System.out.println("Имя: " + getName() + '\n' + "Фамилия: " + getSurname() + '\n' + "Название банка: " + bName);
    }
}
