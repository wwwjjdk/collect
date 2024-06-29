package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(group(new int [] {1, 3, 4, 5, 1, 5, 4}));
    }

    public static Map<Integer, Long> group(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}