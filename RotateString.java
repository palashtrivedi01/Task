//Need to check this

package com.example;

import java.net.SocketOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotateString {
    public  static void main(String[] args){
        String s1 = "Waterbottle";
        String s2 = "erbottlewat";
        if(s1.length()==(s2.length())){
            String w = Stream.of(s1.split("")).map(a -> a.toLowerCase()).sorted().collect(Collectors.joining());

            String h = Stream.of(s2.split("")).map(a -> a.toLowerCase()).sorted().collect(Collectors.joining());
            if(w.equals(h)){

                System.out.println("true");
            }
        }
        System.out.println("false");

    }

}
