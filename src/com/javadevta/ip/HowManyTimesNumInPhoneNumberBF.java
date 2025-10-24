package com.javadevta.ip;

import java.util.Random;
import java.util.stream.Collectors;

public class HowManyTimesNumInPhoneNumberBF {
    public static void main(String[] args) {
        int num = 3;
        String phoneNumber = new Random().ints(9, 0, 10).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining());
        System.out.println(9 + phoneNumber);
        int pn = Integer.parseInt(phoneNumber);
        int count = 0;
        while (pn != 0) {
            int rem = pn % 10;
            if (rem == num)
                count++;
            pn /= 10;
        }
        System.out.println("Times? " + count);
    }
}
