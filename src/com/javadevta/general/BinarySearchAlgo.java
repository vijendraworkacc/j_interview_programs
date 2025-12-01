package com.javadevta.general;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] array = new Random().ints(20, 0, 100).sorted().distinct().toArray();
        System.out.println(Arrays.toString(array));

        int ele = array[15];
        System.out.println("Element being searched: " + ele);
        int index = search(array, ele, 0, array.length);
        System.out.println("index: " + index);
    }

    private static int search(int[] array, int ele, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == ele) {
                return mid;
            } else if (ele < array[mid]) {
                return search(array, ele, 0, mid - 1);
            } else {
                return search(array, ele, mid + 1, right);
            }
        }
        return -1;
    }

}
