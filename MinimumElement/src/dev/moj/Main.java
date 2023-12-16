package dev.moj;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println(findMin(readElements(readInteger())));

        int[] myArray = readElements(readInteger());
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(reverse(myArray)));
    }

    private static int readInteger() {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the of numbers you want to enter: ");
        return sc.nextInt();
    }

    private static int[] readElements(int elementCount) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int[] array = new int[elementCount];
        for (int i = 0; i < elementCount; i++) {
            System.out.print("Enter a number: ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    private static int[] reverse(int[] array) {

        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[array.length - (i + 1)] = array[i];
        }
        return reverseArray;
    }
}
