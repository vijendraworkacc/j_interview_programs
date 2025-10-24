package com.javadevta.ip;

import java.util.Arrays;
import java.util.Random;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = new Random().ints(15, 0, 7).toArray();
        System.out.println(Arrays.toString(array));
        int[] distinct = Arrays.stream(array).distinct().toArray();
        System.out.println(Arrays.toString(distinct));
    }
}
