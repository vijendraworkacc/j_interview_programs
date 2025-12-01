package com.javadevta.general;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreatingArrayOfCharacter {
    public static void main(String[] args) {
        Character[] charArray = IntStream.rangeClosed('A', 'Z').mapToObj(c -> (char) c).toArray(Character[]::new);
        System.out.println("Character Array: " + Arrays.toString(charArray));
    }
}
