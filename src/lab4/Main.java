package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc cal = new Calc();
        cal.firstTask();
        System.out.println("=======================");
        cal.secondTask();
        System.out.println("=======================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = scan.nextInt();
        System.out.println("Результат: " + cal.thirdTask(num1, num2, num3));

        System.out.println("=======================");
        System.out.println("Введите первое число: ");
        int numb1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int numb2 = scan.nextInt();
        System.out.println("Введите третье число: ");
        int numb3 = scan.nextInt();
        System.out.println("Результат: " + cal.fourthTask(numb1, numb2, numb3));
        System.out.println("=======================");
        int[] array = {3,-3,5,4,7,3};
        System.out.println(cal.fifthTask(array));
        System.out.println("=======================");
        int[] arr = {54, 264, 1234, 0, 548789, -8, 1};
        System.out.println("Результат: " + cal.sixthTask(arr));
        System.out.println("Part 2");
        System.out.println();
        int[] array6 = {4,1,1,1,3,3};
        System.out.println(cal.p2FirstTask(array6));
        System.out.println("=======================");
        cal.p2SecondTask();
        System.out.println("=======================");
        int [] ar7 = {5,6,7,2};
        cal.p2ThirdTask(ar7);
        System.out.println("Array 2: " + Arrays.toString(ar7));
     /*   System.out.println("=======================");
        int [] array8 = {1,2,3,4,3,2,1};
        cal.p2FourthTask(array8);
        System.out.println("=======================");
        int [] arrayFin = {5,88,-1,546,12,45,2,87546};
        cal.p2FifthTask(arrayFin);*/
    }
}

