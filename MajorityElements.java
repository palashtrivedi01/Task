package com.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElements {
    public static void main(String[] args) {
        int [] arr={1,2,33,4,4,5,5,5,5,6,7};
        Optional<Integer> mElements= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e-> e.getValue()>arr.length/2).map(Map.Entry::getKey).findFirst();
        System.out.println(mElements.get());
    }

}
