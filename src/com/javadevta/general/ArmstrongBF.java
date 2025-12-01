package com.javadevta.general;

public class ArmstrongBF {
    public static void main(String[] args) {
        int num = 153;
        boolean check = isArmstrong(num);
        System.out.println("Is Armstrong? " + check);
    }

    private static boolean isArmstrong(int num) {
        int count = (num + "").length();
        int safe = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += (int) Math.pow(rem, count);
            // sum += power(rem, count);
            num /= 10;
        }
        return sum == safe;
    }

    private static int power(int rem, int count) {
        int pow = 1;
        for (int i = 0; i < count; i++) {
            pow *= rem;
        }
        return pow;
    }
}
