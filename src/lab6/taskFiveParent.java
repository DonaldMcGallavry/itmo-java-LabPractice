package lab6;

import java.util.Scanner;

public class taskFiveParent {
    private Scanner scanner;
    private String name;
    public taskFiveParent(){
         scanner = new Scanner(System.in);
    }

    public int getAge() {
        System.out.print("Введите ваш возраст: ");
        return scanner.nextInt();
    }

    public String getName(){
        System.out.print("Имя: ");
        return name = scanner.next();
    }
}
