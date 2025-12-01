package com.javadevta.practice;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters__P {
    public static void main(String[] args) {
        String[] inputs = {"aaaaaaaa", "qwertyuiop", "aaaaaabbbb", "xxqwerrrrpoiuyttttt"};
        for (int i = 0; i < inputs.length; i++) {
            String result = longestSubstring(inputs[i]);
            System.out.println(inputs[i] + " -> " + result);
        }
    }

    private static String longestSubstring(String input) {
        Set<Character> subs = new LinkedHashSet<>();
        List<Set<Character>> results = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!subs.add(current)) {
                results.add(new LinkedHashSet<>(subs));
                subs.clear();
                subs.add(current);
            }
        }
        results.add(new LinkedHashSet<>(subs));
        return results.stream().max(Comparator.comparingInt(Set::size)).get().stream().map(String::valueOf).collect(Collectors.joining());
    }

}
