package com.javadevta.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByBitsInBinary {
    public static void main(String[] args) {
        Integer[] array = new Random().ints(10, 0, 10).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        Map<Integer, String> collect = Arrays.stream(array).collect(Collectors.toMap(Function.identity(), Integer::toBinaryString,(v1, v2) -> v1));
        System.out.println(collect);
        Arrays.sort(array, Comparator.comparingInt(Integer::bitCount));
        System.out.println(Arrays.toString(array));
    }
}
