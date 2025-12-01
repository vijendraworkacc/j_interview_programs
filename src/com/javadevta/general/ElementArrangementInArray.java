package com.javadevta.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ElementArrangementInArray {
    public static void main(String[] args) {
        Integer[] array = new Random().ints(10, 0, 3).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Comparator.<Integer>comparingInt(i -> i == 0 ? -1 : i == 1 ? 1 : 0));
        System.out.println(Arrays.toString(array));
    }
}
