package com.javadevta.general;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OnlyKeepUniqueInArrayGroupingBy {
    public static void main(String[] args) {
        int[] array = new Random().ints(17, 0, 15).toArray();
        System.out.println(Arrays.toString(array));
        Integer[] result = Arrays.stream(array).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .map(Map.Entry::getKey)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(result));
    }
}
