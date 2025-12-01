package com.javadevta.general;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class CreatingMatrix5D {
    public static void main(String[] args) {
        int d1 = 5, d2 = 5, d3 = 5, d4 = 5, d5 = 5;
        int[][][][][] array = IntStream.range(0, d1)
                .mapToObj(i -> IntStream.range(0, d2)
                        .mapToObj(j -> IntStream.range(0, d3)
                                .mapToObj(k -> IntStream.range(0, d4)
                                        .mapToObj(l -> IntStream.range(0, d5)
                                                .map(m -> ThreadLocalRandom.current().nextInt()).toArray()
                                        ).toArray(int[][]::new)
                                ).toArray(int[][][]::new)
                        ).toArray(int[][][][]::new)
                ).toArray(int[][][][][]::new);
    }
}