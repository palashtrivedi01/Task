package com.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s = "Silent";
        String k = "iSlednt";
        String w = Stream.of(s.split("")).map(a -> a.toLowerCase()).sorted().collect(Collectors.joining());

        String d = Stream.of(k.split("")).map(a -> a.toLowerCase()).sorted().collect(Collectors.joining());

        System.out.println(w.equals(d));

    }
}
