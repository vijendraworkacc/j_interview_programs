package com.javadevta.ip;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class TrappingRainwaterProblemBF {
    public static void main(String[] args) {
        int[] array = ThreadLocalRandom.current().ints(10, 0, 5).toArray();
        System.out.println("Array: " + Arrays.toString(array));
        int[] fromLeft = new int[array.length];
        int[] fromRight = new int[array.length];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                fromLeft[i] = max;
            } else {
                fromLeft[i] = max;
            }
        }
        max = Integer.MIN_VALUE;
        for (int i = array.length - 1; i >= 0; i--) {
            if (max < array[i]) {
                max = array[i];
                fromRight[i] = max;
            } else {
                fromRight[i] = max;
            }
        }

        System.out.println("From Left: " + Arrays.toString(fromLeft));
        System.out.println("From Right: " + Arrays.toString(fromRight));

        int trapped = 0;
        for (int i = 0; i < array.length; i++) {
            trapped += Math.min(fromLeft[i], fromRight[i]) - array[i];
        }

        System.out.println("Trapped Water: " + trapped);
    }
}
