package com.javadevta.ip;

import java.util.Random;
import java.util.stream.Collectors;

public class ReverseNumberInteger {
    public static void main(String[] args) {
        String number = new Random().ints(9, 1, 10).mapToObj(String::valueOf).collect(Collectors.joining());
        System.out.println("Number: " + number);
        int num = Integer.parseInt(number);
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("Reverse: " + rev);
    }
}
