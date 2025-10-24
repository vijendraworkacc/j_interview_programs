package com.javadevta.ip;

import java.util.*;

public class LongestIncreasingSubSequenceBF {
    public static void main(String[] args) {
        int[] array = new Random().ints(17, -10, 11).toArray();
        System.out.println(Arrays.toString(array));
        List<Set<Integer>> subArrays = new ArrayList<>();
        Set<Integer> elements = new TreeSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                elements.add(array[i]);
                elements.add(array[i + 1]);
            } else {
                subArrays.add(elements);
                elements = new TreeSet<>();
            }
        }
        System.out.println(subArrays);
        System.out.println(subArrays.stream().max(Comparator.comparingInt(Set::size)).get());
    }
}
