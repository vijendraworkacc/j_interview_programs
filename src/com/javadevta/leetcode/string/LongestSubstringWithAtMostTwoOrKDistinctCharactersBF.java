package com.javadevta.leetcode.string;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstringWithAtMostTwoOrKDistinctCharactersBF {
    public static void main(String[] args) {
        String input = "abcbbbbcccbdddadacb";
        String result = longestSubstring(input, 2);
        System.out.println(result);
    }

    private static String longestSubstring(String input, int k) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                String substring = input.substring(i, j);
                if (kTypeCharacter(substring, k)) {
                    result.add(substring);
                }
            }
        }
        return result.stream().max(Comparator.comparingInt(String::length)).get();
    }

    private static boolean kTypeCharacter(String input, int k) {
        return input.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == k;
    }

}

