package com.javadevta.ip;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class BestAverageMarksBF {
    public static void main(String[] args) {
        String[][] marks = {{"A", "30"}, {"B", "40"}, {"C", "90"}, {"A", "50"}, {"C", "30"}, {"A", "70"}, {"B", "60"}, {"A", "30"}, {"C", "80"}, {"C", "30"}, {"B", "80"}};
        Map<String, Double> collect = Arrays.stream(marks).collect(Collectors.groupingBy(arr -> arr[0], Collectors.averagingInt(arr -> Integer.parseInt(arr[1]))));
        System.out.println(collect);
        System.out.println(collect.entrySet().stream().max((e1, e2) -> (int) (e1.getValue() - e2.getValue())).get());
    }
}
