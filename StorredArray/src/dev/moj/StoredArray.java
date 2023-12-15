package dev.moj;

import java.util.Scanner;

public class StoredArray {


    public static int[] getIntegers(int len) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        boolean  flag = true;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[i];
        }
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length -1 ; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i +1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] array = getIntegers(4);
        printArray(array);
        printArray(sortIntegers(array));
    }

}
