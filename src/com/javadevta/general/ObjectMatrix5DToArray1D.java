package com.javadevta.general;

import java.util.Arrays;

public class ObjectMatrix5DToArray1D {
    public static void main(String[] args) {
        Object[][][][][] matrix = {{{
            {
                {1, 2, 3}, {'a', 'b', 'c'}
            }, {
                {1, 2, 3}, {'a', 'b', 'c'}
            }
            }, {
            {
                {1, 2, 3}, {'a', 'b', 'c'}
            }, {
                {1, 2, 3}, {'a', 'b', 'c'}
            }
        }
        }};

        Object[] array = Arrays.stream(matrix).flatMap(Arrays::stream).flatMap(Arrays::stream).flatMap(Arrays::stream).flatMap(Arrays::stream).toArray();
        System.out.println(Arrays.toString(array));
    }
}
