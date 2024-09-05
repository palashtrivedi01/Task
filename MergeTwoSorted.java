package com.example;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSorted {
    public static  void main(String[] args){

        List<Integer> list1 = Arrays.asList(5,56,123);
        List<Integer> list2 = Arrays.asList(1,5,15);


        List<Integer> list = Stream.concat(list1.stream(),list2.stream())
                .sorted().collect(Collectors.toList());

        System.out.println(list);

    }
}
