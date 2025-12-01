package com.javadevta.general;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreatingArrayOfContinuousIntegerNumbers {
    public static void main(String[] args) {
        int[] array = IntStream.rangeClosed(0, 10).toArray();
        System.out.println(Arrays.toString(array));
    }
}
