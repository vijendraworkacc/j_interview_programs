package com.javadevta.leetcode.string;

import java.util.Comparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithAtMostTwoOrKDistinctCharacters {
    public static void main(String[] args) {
        String input = "abcbbbbcccbdddadacb";
        String result = longestSubstring(input, 2);
        System.out.println(result); // Expected: bcbbbbcccb
    }

    private static String longestSubstring(String input, int k) {
        if (input == null || input.isEmpty() || k <= 0) {
            return "";
        }

        List<String> windows = allMaximalSubstringsAtMostKDistinct(input, k);

        // Pick the longest substring among all maximal substrings
        return windows.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    // Generalized version of your helper for "at most k distinct"
    private static List<String> allMaximalSubstringsAtMostKDistinct(String input, int k) {
        int start = 0;
        Map<Character, Integer> freq = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (int end = 0; end < input.length(); end++) {
            char c = input.charAt(end);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.size() > k) {
                // current window [start..end-1] was a maximal valid window
                result.add(input.substring(start, end)); // add before shrinking

                // now shrink
                char leftChar = input.charAt(start);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                start++;
            }
        }

        // Final window [start..end-1] is also valid and maximal
        if (!input.isEmpty()) {
            result.add(input.substring(start));
        }

        return result;
    }
}