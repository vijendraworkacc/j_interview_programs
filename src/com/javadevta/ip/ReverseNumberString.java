package com.javadevta.ip;

import java.util.Random;
import java.util.stream.Collectors;

public class ReverseNumberString {
    public static void main(String[] args) {
        String number = new Random().ints(10, 0, 10).mapToObj(String::valueOf).collect(Collectors.joining());
        System.out.println("Original: " + number);
        String reverse = new StringBuilder(number).reverse().toString();
        System.out.println("Reverse: " + reverse);
    }
}
