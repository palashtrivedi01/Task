package com.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;

        int length= array.length;
         k= k% length;
         int [] r = IntStream.range(0,length)
                 .map(i->arr[(i+length-k)% length]).toArray();
        System.out.println(Arrays.toString(r));
    }
}
