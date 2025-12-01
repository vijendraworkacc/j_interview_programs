package com.javadevta.general;

import java.util.ArrayList;
import java.util.List;

public class NextGreatestCombinationOfNumberBF {
    private static List<Integer> integers = new ArrayList<>();
    private static int length = 0;

    public static void main(String[] args) {
        int num = 1234;
        length = (num + "").length();
        System.out.println("Next Greatest: " + getNextGreatest(num));
    }

    private static Integer getNextGreatest(int num) {
        combination("", String.valueOf(num));
        System.out.println("Combinations: " + integers);
        return integers.stream().sorted().skip(1).findFirst().get();
    }

    private static void combination(String prefix, String remaining) {
        if (!prefix.equals("") && prefix.length() == length) {
            integers.add(Integer.parseInt(prefix));
        }
        for (int i = 0; i < remaining.length(); i++) {
            combination(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }
}
