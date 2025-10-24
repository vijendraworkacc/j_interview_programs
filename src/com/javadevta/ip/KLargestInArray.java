package com.javadevta.ip;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class KLargestInArray {
    public static void main(String[] args) {
        int k = 3;
        List<Integer> source = new Random().ints(17, 0, 100).boxed().collect(Collectors.toList());
        Collections.shuffle(source);
        System.out.println(source);
        Integer kLargest = source.stream()
                .sorted(Comparator.reverseOrder())
                .skip(k - 1)
                .findFirst()
                .get();
        System.out.println(kLargest);
    }
}
