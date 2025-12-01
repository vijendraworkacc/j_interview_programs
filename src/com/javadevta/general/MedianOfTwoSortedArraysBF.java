package com.javadevta.general;

import java.util.Arrays;
import java.util.Random;

public class MedianOfTwoSortedArraysBF {
    public static void main(String[] args) {
        int[] array1 = new Random().ints(16, -20, 21).sorted().toArray();
        int[] array2 = new Random().ints(12, -10, 11).sorted().toArray();
        int[] result = new int[array1.length + array2.length];
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k++] = array1[i++];
            } else if (array1[i] > array2[j]) {
                result[k++] = array2[j++];
            } else {
                result[k++] = array1[i++];
                result[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        System.out.println(Arrays.toString(result));

        int medianIndex = result.length / 2;
        if (result.length % 2 == 0) {
            System.out.println("Median: " + result[medianIndex]);
        } else {
            System.out.println("Median: " + (result[medianIndex] + result[medianIndex - 1]) / 2.0);
        }

    }
}
