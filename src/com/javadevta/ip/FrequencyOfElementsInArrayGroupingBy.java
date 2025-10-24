package com.javadevta.ip;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class FrequencyOfElementsInArrayGroupingBy {
    public static void main(String[] args) {
        int[] array = new Random().ints(14, 0, 7).toArray();
        System.out.println(Arrays.toString(array));
        Map<Integer, Long> frequency = Arrays.stream(array).boxed().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
        System.out.println(frequency);

    }
}
