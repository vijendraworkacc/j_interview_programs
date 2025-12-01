package com.javadevta.general;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OnlyDuplicatesInArrayGroupingBy {
    public static void main(String[] args) {
        int[] array = new Random().ints(15, 0, 11).toArray();
        System.out.println("Original: " + Arrays.toString(array));
        Integer[] result = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toArray(Integer[]::new);
        System.out.println("Only Duplicates: " + Arrays.toString(result));
    }
}
