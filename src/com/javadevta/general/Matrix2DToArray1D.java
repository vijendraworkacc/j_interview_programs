package com.javadevta.general;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Matrix2DToArray1D {
    public static void main(String[] args) {
        int rows = 5, cols = 5;
        int[][] array2d = IntStream.range(0, rows).mapToObj(r -> IntStream.range(0, cols).map(c -> new Random().nextInt(1, 21)).toArray()).toArray(int[][]::new);
        for (int[] arr: array2d)
            System.out.println(Arrays.toString(arr));

        int[] array = Arrays.stream(array2d).flatMapToInt(Arrays::stream).toArray();
        System.out.println("\nResult: " + Arrays.toString(array));
    }
}
