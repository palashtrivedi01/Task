package com.strings;

import java.util.stream.Stream;

public class StringToInteger {
    public static void main(String[] args) {
        String input="1234";
//        int num=Integer.parseInt(input);
//        System.out.println(num);
        int a= Stream.of(input).map(Integer::parseInt).findFirst().orElse(null);
        System.out.println(a);
    }
}
