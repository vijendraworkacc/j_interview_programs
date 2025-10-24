package com.javadevta.ip;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class CreatingMatrix3D {
    public static void main(String[] args) {
        int x = 5, y = 5, z = 5;
        Random random = new Random();
        int[][][] array3d = IntStream.range(0, x).mapToObj(i -> IntStream.range(0, y).mapToObj(j -> IntStream.range(0, z).map(k -> random.nextInt(1, 21)).toArray()).toArray(int[][]::new)).toArray(int[][][]::new);
        System.out.println("[");
        for (int[][] arr2d : array3d) {
            System.out.println("  " + Arrays.deepToString(arr2d));
        }
        System.out.println("]");
    }
}
