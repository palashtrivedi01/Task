package com.example;
//
//public class ReverseWords
//{
//    String input = "Hello World";
//    String output = reverseWordsWithString(input);
//    system.out.println(output);
//}
//
//    public static String reverseWordsWithString(String str){
//        String[] words = str.split("");
//        StringBuilder reverseString = new StringBuilder();
//        for(String word : words){
//            StringBuilder reverseWord = new StringBuilder(word);
//            reverseString.append(reverseWord.reverse().toString()).append("");
//    }
//        return  reverseString.toString().trim();
//}


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args){
        String s1 = "This is the coding time ";

        String s = Stream.of(s1.split(" "))
                .map(words -> new StringBuilder(words).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(s);

    }
}