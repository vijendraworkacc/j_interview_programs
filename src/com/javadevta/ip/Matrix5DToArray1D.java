package com.javadevta.ip;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Matrix5DToArray1D {
    public static void main(String[] args) {
        int d1 = 2, d2 = 2, d3 = 2, d4 = 2, d5 = 2;
        int[][][][][] array = IntStream.range(0, d1)
                .mapToObj(i -> IntStream.range(0, d2)
                        .mapToObj(j -> IntStream.range(0, d3)
                                .mapToObj(k -> IntStream.range(0, d4)
                                        .mapToObj(l -> IntStream.range(0, d5)
                                                .map(m -> ThreadLocalRandom.current().nextInt(1, 21)).toArray()
                                        ).toArray(int[][]::new)
                                ).toArray(int[][][]::new)
                        ).toArray(int[][][][]::new)
                ).toArray(int[][][][][]::new);

        int[] result = Arrays.stream(array).flatMap(Arrays::stream).flatMap(Arrays::stream).flatMap(Arrays::stream).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(result));
    }
}