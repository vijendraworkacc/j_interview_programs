package com.javadevta.ip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MaxSumSubArrayIndicesBF {
    public static class Indices {
        int start;
        int end;
        int sum;
        public Indices(int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
        }

        @Override
        public String toString() {
            return "Indices{" +
                    "start=" + start +
                    ", end=" + end +
                    ", sum=" + sum +
                    '}';
        }
    }
    public static void main(String[] args) {
        int[] array = new Random().ints(10, -20, 20).toArray();
        System.out.println(Arrays.toString(array));
        Indices bestIndices = bestIndices(array);
        System.out.println(bestIndices.start + ", " + bestIndices.end + ", " + bestIndices.sum);
    }

    private static Indices bestIndices(int[] array) {
        List<Indices> indicesList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                indicesList.add(new Indices(i, j, sum));
                sum = 0;
            }
        }
        return indicesList.stream().sorted((i1, i2) -> i2.sum - i1.sum).findFirst().get();
    }
}
