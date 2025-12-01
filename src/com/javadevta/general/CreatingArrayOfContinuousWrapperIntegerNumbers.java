package com.javadevta.general;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreatingArrayOfContinuousWrapperIntegerNumbers {
    public static void main(String[] args) {
        Integer[] array = IntStream.rangeClosed(0, 15).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    }
}

