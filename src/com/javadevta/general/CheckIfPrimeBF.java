package com.javadevta.general;

import java.util.Random;

public class CheckIfPrimeBF {
    public static void main(String[] args) {
        int num = new Random().nextInt(65, 76);
        // num = 71;
        System.out.println("Number: " + num);
        boolean check = isPrime(num);
        System.out.println("Is Prime? " + check);
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
           if (num % i == 0)
               return false;
        }
        return true;
    }
}
