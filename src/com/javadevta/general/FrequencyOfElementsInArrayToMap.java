package com.javadevta.general;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FrequencyOfElementsInArrayToMap {
    public static void main(String[] args) {
        int[] array = new Random().ints(25, 0, 10).toArray();
        System.out.println(Arrays.toString(array));

        TreeMap<Integer, Integer> frequency = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toMap(
                        integer -> integer,
                        integer -> 1,
                        (integer1, integer2) -> integer1 + 1,
                        TreeMap::new)
                );

        System.out.println(frequency);
    }
}
