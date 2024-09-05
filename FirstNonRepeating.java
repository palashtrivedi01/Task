package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str=" Azmi Khan";

        Character first=str.chars().mapToObj(a->(char) a).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);

    System.out.println(first);
    }
}
