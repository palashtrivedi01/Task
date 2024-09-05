package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("D");

        Stream<String> stream = list.stream().distinct();
        stream.forEach(System.out::println);

    }






}
