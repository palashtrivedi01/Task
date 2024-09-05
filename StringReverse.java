package com.strings;

import javax.naming.StringRefAddr;


import java.util.stream.Stream;
import java.util.*;
import java. util.List;
import java.util.stream.Collectors;

public class StringReverse {
    public static <Char> void main(String[] args) {


      //  Stream stream= Stream.of("hello world").reverse().forEach(System.out::print);

       /* Stream str=Stream.of("Hello world");

        str.collect.toList();
        str.collections.reverse();
        str.List.stream().forEach(System.out::print);*/

        String str="hello world";
        String str1=Stream.of(str.split(" ")).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));

       System.out.println(str);
        System.out.println(str1);

    }
}
