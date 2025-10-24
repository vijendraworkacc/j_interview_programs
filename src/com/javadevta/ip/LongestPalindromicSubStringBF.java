package com.javadevta.ip;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubStringBF {
    public static void main(String[] args) {
        String input = "abvc" + "abba" + "asdfgh" + "lkjkl" + "aca" + "qwertyuio";
        System.out.println("Input: " + input);
        Set<String> set = new HashSet<>();
        int window = 2;
        while (window <= input.length()) {
            int i = 0, j = i + window;
            while (j < input.length()) {
                if (checkPalindrome(input.substring(i, j))) {
                    set.add(input.substring(i++, j++));
                } else {
                    i++; j++;
                }
            }
            window++;
        }
        System.out.println(set);
        String longest = set.stream().max((s1, s2) -> s1.length() - s2.length()).get();
        System.out.println(longest);

    }

    private static boolean checkPalindrome(String input) {
        return new StringBuilder(input).reverse().compareTo(new StringBuilder(input)) == 0;
    }
}
