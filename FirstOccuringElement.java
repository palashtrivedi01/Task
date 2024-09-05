package com.example;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class FirstOccuringElement {

    public static void main(String[] args) {
        String input = "Payal";
        Character firstNonRepeatedChar = logic(input);
        System.out.println("ans :" + firstNonRepeatedChar);
    }

    private static Character logic(String input) {
        Character result = input.chars()
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst().get();

        return result;
    }
}