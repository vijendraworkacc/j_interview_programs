package com.javadevta.ip;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] array = new Random().ints(17, 0, 100).toArray();
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
