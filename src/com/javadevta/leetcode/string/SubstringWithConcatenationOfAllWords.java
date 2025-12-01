package com.javadevta.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        String input = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<String> combinations = generateStringCombinations(words);
    }

    private static List<String> generateStringCombinations(String[] words) {
        List<String> combinations = new ArrayList<>();
        permute(words, 0, combinations);
        return combinations;
    }

    private static void permute(String[] words, int index, List<String> combinations) {
        
    }
}
