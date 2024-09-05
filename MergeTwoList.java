package com.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {

    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(2,4,6);
        List<Integer> l2= Arrays.asList(1,2);
        List<Integer> ob = Stream.concat(l1.stream(),l2.stream()).sorted().collect(Collectors.toList());
        System.out.println(ob);

    }

}
