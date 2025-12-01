package com.javadevta.general;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Random;

public class FrequencyOfElementsInArrayMerge {
    public static void main(String[] args) {
        int[] array = new Random().ints(25, 0, 10).toArray();
        System.out.println(Arrays.toString(array));

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.stream(array).forEach(i -> map.merge(i, 1, (v1, v2) -> v1 + 1));
        System.out.println(map);
    }
}
