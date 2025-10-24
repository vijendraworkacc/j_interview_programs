package com.javadevta.ip;

import java.util.Arrays;
import java.util.Random;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, -20, 20).toArray();
        // int[] array = {-1, 0, 10, -1, -3, 14, -10, 0};
        System.out.println(Arrays.toString(array));
        int max = maxSum(array);
        System.out.println(max);
    }

    private static int maxSum(int[] array) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (Integer i: array) {
            current = Math.max(i, current + i);
            max = Math.max(max, current);
        }
        return max;
    }
}
