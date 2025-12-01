package com.javadevta.general;

public class CharacterCountInSequence {
    public static void main(String[] args) {
        String input = "aaabbcaabbbcxxxceeke";
        String result = countInSequence(input);
        System.out.println(result);
    }

    private static String countInSequence(String input) {
        char[] array = (input + " ").toCharArray();
        char current = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (current == array[i]) {
                count++;
            } else {
                System.out.print(current + "" + count);
                count = 1;
                current = array[i];
            }
        }
        return "";
    }
}
