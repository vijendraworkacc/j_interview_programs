package com.javadevta.leetcode.old;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String[] inputs = {"aaaaa", "bb", "aabb", "aaannmalayalambbtenetttt", "tenet"};
        List<String> results = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            String result = longestPalindrome(inputs[i] + " ");
            System.out.println(inputs[i] + " -> " + result);
        }
    }

    private static String longestPalindrome(String input) {
        List<String> results = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                boolean isPalindrome = isPalindrome(input.substring(i, j));
                if (isPalindrome) {
                    results.add(input.substring(i, j));
                }
            }
        }
        return results.stream().max(Comparator.comparingInt(String::length)).get();
    }

    private static boolean isPalindrome(String input) {
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i++) != input.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
