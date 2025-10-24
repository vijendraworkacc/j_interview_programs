package com.javadevta.ip;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String input1 = "apple";
        String input2 = "plepp";
        char[] arr1 = input1.toCharArray();
        char[] arr2 = input2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Is Anagram? " + (Arrays.equals(arr1, arr2) ? "Yes" : "No"));

    }
}
