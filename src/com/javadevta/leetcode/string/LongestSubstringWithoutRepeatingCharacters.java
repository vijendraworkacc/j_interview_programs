package com.javadevta.leetcode.string;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String[] inputs = {"aaaaaaaa", "qwertyuiop", "aaaaaabbbb", "xxxxxxqwerrrrpoiuyttttt"};
        for (int i = 0; i < inputs.length; i++) {
            String result = longestSubstring(inputs[i]);
            System.out.println(inputs[i] + " -> " + result);
        }
    }

    private static String longestSubstring(String input) {
        if (input == null || input.isEmpty()) return "";
        Set<Character> subs = new LinkedHashSet<>();
        List<Set<Character>> results = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!subs.add(current)) {
                results.add(new LinkedHashSet<>(subs));
                // This creates a new copy (a clone) of the current subs at that moment.
                // Even if you clear or modify subs later, the copied set in results remains intact.
                // This way, results truly holds independent versions of each substring found so far.
                subs.clear();
                subs.add(current); // start new substring
            }
        }
        results.add(new LinkedHashSet<>(subs));
        Set<Character> longestSet = results.stream()
                .max(Comparator.comparingInt(Set::size))
                .orElse(Collections.emptySet());
        return longestSet.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
