package com.strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams
{
    public static void main(String[] args) {
        String str="Listen";
        String str1="sint";


        String s = Stream.of(str.split("")).map(i->i.toLowerCase()).sorted().collect(Collectors.joining());
        String s1 = Stream.of(str1.split("")).map(i->i.toLowerCase()).sorted().collect(Collectors.joining());

        if(s.equals(s1))
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }
    }
}
