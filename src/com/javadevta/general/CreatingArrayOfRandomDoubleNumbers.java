package com.javadevta.general;

import java.util.Arrays;
import java.util.Random;

public class CreatingArrayOfRandomDoubleNumbers {
    public static void main(String[] args) {
        double[] array = new Random().doubles(13, 1, 10).toArray();
        System.out.println(Arrays.toString(array));

    }
}
