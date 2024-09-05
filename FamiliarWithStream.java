package com.example;

import java.util.Arrays;
import java.util.List;

public class FamiliarWithStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5);
        list.stream().filter(a -> a % 2 == 0).distinct().forEach(System.out::println);
        ;
    }
}