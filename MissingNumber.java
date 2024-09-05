package com.strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class MissingNumber {

    public static void main(String[] args) {

        int[] numbers = new int[] { 1, 4, 3};
        //int expectedSum = (n* (n + 1)) / 2;

        int actualSum = Arrays.stream(numbers).sum();
        int expectedSum = 10;
        int missingNumber = expectedSum - actualSum;
        System.out.println(missingNumber);

    }
}
