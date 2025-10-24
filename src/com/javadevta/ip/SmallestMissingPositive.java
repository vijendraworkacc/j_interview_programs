package com.javadevta.ip;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestMissingPositive {
    public static void main(String[] args) {
        int[] array = new Random().ints(17, -10, 10).toArray();
        System.out.println(Arrays.toString(array));
        Set<Integer> source = Arrays.stream(array).boxed().filter(i -> i > 0).collect(Collectors.toSet());
        int missing = IntStream.iterate(1, i -> ++i)
                .filter(i -> !source.contains(i))
                .findFirst()
                .orElse(1);
        System.out.println(missing);
    }
}
