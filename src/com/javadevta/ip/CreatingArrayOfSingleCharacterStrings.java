package com.javadevta.ip;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreatingArrayOfSingleCharacterStrings {
    public static void main(String[] args) {
        String[] stringArray = IntStream.rangeClosed('A', 'Z').mapToObj(c -> "" + ((char) c)).toArray(String[]::new);
        System.out.println("String Array: " + Arrays.toString(stringArray));
    }
}
