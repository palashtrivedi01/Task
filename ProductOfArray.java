package com.strings;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProductOfArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5};

        int prod = IntStream.of(arr).reduce(1, (x, y)->x*y);
    System.out.println(prod);

    }
}
