package com.javadevta.ip;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Character[] array = new Random().ints(50, 'A',
                'Z').mapToObj(c -> (char) c).toArray(Character[]::new);
        System.out.println(Arrays.toString(array));

        Character key = Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
        System.out.println("First non-repeating: " + key);
    }
}
