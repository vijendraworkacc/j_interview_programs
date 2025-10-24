package com.javadevta.ip;

public class PalindromeBF {
    public static void main(String[] args) {
        String input = "aabcxbaa";
        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }

    private static boolean checkPalindrome(String input) {
        int i = 0, j = input.length() - 1;
        while (i != j) {
            if (input.charAt(i++) != input.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
