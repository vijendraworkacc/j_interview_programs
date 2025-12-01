package com.javadevta.general;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestNonRepeatingCharacterSubStringBF {
    public static void main(String[] args) {
        String randomInput = new Random().ints(30, 'a', 'e').mapToObj(c -> "" + (char) c).collect(Collectors.joining());
        System.out.println(randomInput);
        Set<Set<Character>> sets = new LinkedHashSet<>();
        Set<Character> subset = new LinkedHashSet<>();

        for (int i = 0; i < randomInput.length(); i++) {
            if (!subset.add(randomInput.charAt(i))) {
                sets.add(subset);
                subset = new HashSet<>();
                subset.add(randomInput.charAt(i));
            }
        }

        System.out.println(sets);
    }
}
