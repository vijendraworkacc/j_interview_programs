package com.javadevta.ip;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreatingIdentityMatrix2D {
    public static void main(String[] args) {
        int rows = 5, cols = 5;
        int[][] array2d = IntStream.range(0, rows).mapToObj(r -> IntStream.range(0, cols).map(c -> r == c ? 1 : 0).toArray()).toArray(int[][]::new);
        for (int[] arr: array2d)
            System.out.println(Arrays.toString(arr));
    }
}
