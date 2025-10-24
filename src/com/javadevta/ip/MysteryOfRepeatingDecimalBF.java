package com.javadevta.ip;

public class MysteryOfRepeatingDecimalBF {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double decimalNum = (double) 1 / i;
            System.out.print(decimalNum + " => ");
            pattern(decimalNum + " ");
        }
    }

    private static void pattern(String decimalNum) {
        String[] split = decimalNum.split("\\.");
        System.out.print(split[0] + ".");
        char[] charArray = split[1].toCharArray();
        char current = charArray[0];
        int count = 1;
        for (int i = 1; i < charArray.length; i++) {
            if (current == charArray[i]) {
                count++;
                if (count >= 3) {
                    System.out.print("(" + current + ")");
                    break;
                }
            } else {
                System.out.print(current);
            }
            current = charArray[i];
        }
        System.out.println();
    }
}

