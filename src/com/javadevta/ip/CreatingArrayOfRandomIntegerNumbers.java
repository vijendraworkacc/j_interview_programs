package com.javadevta.ip;

import java.util.Arrays;
import java.util.Random;

public class CreatingArrayOfRandomIntegerNumbers {
    public static void main(String[] args) {
        int[] array = new Random().ints(17, 0, 10).toArray();
        System.out.println(Arrays.toString(array));
    }
}
