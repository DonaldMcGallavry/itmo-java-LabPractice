package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Calc {

    public void firstTask (){
        for (int i = 1; i < 100;i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public void secondTask() {

        System.out.println("Делятся на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Делятся на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Делятся на 3 и на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public void thirdTask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = scan.nextInt();
        int sum = num1 + num2;

        if (num1 + num2 == num3){
            System.out.println("Результат: true");
        } else {
            System.out.println("Результат: false");
        }
    }
    public void fourthTask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = scan.nextInt();
        if (num2 > num1 && num3 > num2){
            System.out.println("Результат: true");
        } else {
            System.out.println("Результат: false");
        }
    }
    public void fifthTask(){
        int[] array = {3,-3,5,4,7,3};
        System.out.println(Arrays.toString(array));
        if (array.length < 2){
            System.out.println("Размер массива должен быть больше или равен 2");
        }
        if(array[0] == 3 && array[array.length - 1] == 3){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public void sixthTask() {
        int[] arr = {54, 264, 1234, 0, 548789, -8, 1};
        System.out.println(Arrays.toString(arr));
        boolean contain1_3 = false;

        for(int i : arr){
            if (i == 1|| i ==3){
                contain1_3 = true;
            }
        }
        if  (contain1_3 == true){
            System.out.println("массив содержит число 1 или 3");
        } else {
            System.out.println("Массив не содержит число 1 или 3");
        }
    }
    public void p2FirstTask(){
        int[] array6 = {1,1,1,1,3,3};
        boolean sorted = true;
        for (int i = 0;i < array6.length - 1;i++){
            if (array6[i] > array6[i+1]){
                sorted = false;
                break;
            }
        }
        if (!sorted){
            System.out.println("Please, try again");
        } else {
            System.out.println("Ok");
        }
    }
    public void p2SecondTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length: ");
        int l = scanner.nextInt();
        int[] arrray7 = new int[l];
        System.out.println("Numbers of arrays: ");
        for (int i = 0;  i < arrray7.length;i++){
            arrray7[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrray7));
    }
    public void p2ThirdTask(){
        int [] ar7 = {5,6,7,2};
        System.out.println("Array 1: " + Arrays.toString(ar7));

        int temp = ar7[0];
        ar7[0] = ar7[ar7.length - 1];
        ar7[ar7.length - 1]= temp;

        System.out.println("Array 2: " + Arrays.toString(ar7));
    }
    public void p2FourthTask() {
        int [] array8 = {1,2,3,4,3,2,1};
        int uniqueNumber = findUnique(array8);

        if (uniqueNumber != -1){
            System.out.println("Первое уникальное число: " + uniqueNumber);
        } else {
            System.out.println("Нет уникальных чисел в массиве");
        }
    }
    public int findUnique(int [] array8) {

        int[] count = new int[array8.length];

        for (int i = 0; i < array8.length; i++) {
            for (int j = 0; j < array8.length; j++) {
                if (array8[i] == array8[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < array8.length; i++) {
            if (count[i] == 1) {
                return array8[i];
            }
        }
        return -1;
    }

    public void p2FifthTask(){
        int [] arrayFin = {5,88,-1,546,12,45,2,87546};
        System.out.println(Arrays.toString(arrayFin));
        int [] result = mergeSort(arrayFin);

        System.out.println(Arrays.toString(result));
    }

    public int [] mergeSort(int [] arrayFin){

        if (arrayFin.length <2){
            return arrayFin;
        }
        int mid = arrayFin.length/2;
        int [] left = new int[mid];
        int[] right;

        if (arrayFin.length % 2 == 0){
            right = new int[mid];
        } else  {
            right = new int[mid +1];
        }
// delete
        for (int i = 0; i < left.length; i++){
            left[i] = arrayFin[i];
        }
        for (int i = 0; i < right.length; i++){
            right[i] = arrayFin[mid + i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeParts(left, right);
    }

    private int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length){
            if (leftPointer < left.length && rightPointer < right.length){
                if (left[leftPointer] < right[rightPointer]){
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
