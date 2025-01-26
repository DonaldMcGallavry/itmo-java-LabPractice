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
    public boolean thirdTask(int num1, int num2, int num3){

        int sum = num1 + num2;
        boolean trueSum = false;

        if (num1 + num2 == num3){
            return trueSum = true;
        } else {
            return trueSum;
        }
    }
    public boolean fourthTask(int numb1, int numb2, int numb3){

        boolean sorted = false;
        if (numb2 > numb1 && numb3 > numb2){
            return sorted = true;
        } else {
            return sorted;
        }
    }
    public boolean fifthTask(int[] array){

        System.out.println(Arrays.toString(array));
        boolean trueElem = false;
        if (array.length < 2){
            System.out.println("Размер массива должен быть больше или равен 2");
        }
        if(array[0] == 3 && array[array.length - 1] == 3){
            return trueElem = true;
        } else {
            return trueElem;
        }
    }
    public boolean sixthTask(int[] arr) {

        System.out.println(Arrays.toString(arr));
        boolean contain1_3 = false;

        for(int i : arr){
            if (i == 1|| i ==3){
                contain1_3 = true;
            }
        }
        return contain1_3;
    }
    public String p2FirstTask(int[] array6){

        boolean sorted = true;
        String truth = "Ok";
        String notTruth = "Please, try again";
        for (int i = 0;i < array6.length - 1;i++){
            if (array6[i] > array6[i+1]){
                sorted = false;
                break;
            }
        }
        if (!sorted){
            return notTruth;
        } else {
            return truth;
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
    public int [] p2ThirdTask(int [] ar7){

        System.out.println("Array 1: " + Arrays.toString(ar7));

        int temp = ar7[0];
        ar7[0] = ar7[ar7.length - 1];
        ar7[ar7.length - 1]= temp;

        return ar7;
    }
    public void p2FourthTask(int [] array8) {

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

    public void p2FifthTask(int [] arrayFin){

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
