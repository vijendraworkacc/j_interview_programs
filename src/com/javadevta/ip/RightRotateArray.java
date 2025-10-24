package com.javadevta.ip;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RightRotateArray {
    public static void main(String[] args) {
        int k = 2;
        int[] array = IntStream.rangeClosed(1, 15).toArray();
        int n = array.length;
        System.out.println(Arrays.toString(array));
        int[] result = IntStream.range(0, n).map(i -> array[(i - k + n) % n]).toArray();
        System.out.println(Arrays.toString(result));
    }
}
