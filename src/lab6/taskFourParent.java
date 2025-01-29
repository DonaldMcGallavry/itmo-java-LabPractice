package lab6;

import java.util.Scanner;

public class taskFourParent {
    protected int number;

    public taskFourParent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру: ");
        this.number = scanner.nextInt();
    }

    public int getNumber (){
        return number;
    }
}
