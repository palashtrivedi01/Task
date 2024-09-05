/*package com.strings;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    public static Set<String> getPermutation(String str) {
        Set<String> permutation = new HashSet<String>();
        permute(str,"",permutation);
        return  permutation;



    }

    public static void permute(String str, String prefix, Set<String> permutation) {
        int n=str.length();
        if(n==0) {
            permutation.add(prefix);
        }
        else
        {
            for (int i=0;i<n;i++) {
                String rem=str.substring(0 + 1)+str.substring(i,i+1);
                permute(rem,prefix+str.charAt(i),permutation);

            }
        }

    }
}

public static void main(String[] args) {

    String input="ABC";
    Set<String> permutation = StringPermutation.getPermutation(input);
    permutation.forEach(System.out::println);
}*/