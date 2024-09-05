package com.strings;

import java.util.stream.Stream;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "elttobretaw";
        String r=str1+str1;
        System.out.println(r.contains(str2));
    }
}
