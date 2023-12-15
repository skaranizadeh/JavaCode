package dev.moj;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = getRandomArray(10);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int[] arrTemp = new int[arr.length];
        int j = arr.length -1;
        for (int i = 0 ; i < arr.length; i++) {
            arrTemp[j--] = arr[i];
        }
        arr = arrTemp;
        System.out.println(Arrays.toString(arr));

    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }
}
