package com.javadevta.general;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UnknownDArrayTo1D {
    public static void main(String[] args) {
        Object[] unknown = new Object[]{new Object[]{new Object[]{1, 2}, 1}, new Object[]{new Object[]{new Object[]{"A", 1}, 12}, 'a'}};
        List<Object> result = new ArrayList<>();
        flatten(unknown, result);
        System.out.println(result);
    }

    private static void flatten(Object unknown, List<Object> result) {
        if (unknown != null) {
            if (unknown.getClass().isArray()) {
                int length = Array.getLength(unknown);
                for (int i = 0; i < length; i++) {
                    Object element = Array.get(unknown, i);
                    flatten(element, result);
                }
            } else if (unknown instanceof Iterable<?>) {
                for (Object element: (Iterable<? extends Object>) unknown) {
                    flatten(element, result);
                }
            } else {
                result.add(unknown);
            }
        }
    }
}
