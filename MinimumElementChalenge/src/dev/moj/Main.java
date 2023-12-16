package dev.moj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //readIntegers();
        System.out.println(findMin(readIntegers()));
    }

    private static int[] readIntegers() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of integers, separated by commas: ");
        String input = sc.nextLine();

        String[] strings = input.split(",");
        int[] array = new int[strings.length];

        int i = 0;
        for (String s : strings) {
            array[i++] = Integer.parseInt(s.trim());
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
