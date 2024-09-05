package com.strings;

import java.util.Arrays;

public class LongestPrefix {
    public  static  void  main(String[] args){
        String [] str1 = {"flower", "flow","flaw"};
        String longest = Arrays.stream(str1).reduce((s, t)-> {
            int min = Math.min(s.length(),t.length());
            int i = 0;
            while(i<min && s.charAt(i) == t.charAt(i)){
                i++;
            }
            return s.substring(0,i);
        }).orElse("");
        System.out.println(longest);
    }
}