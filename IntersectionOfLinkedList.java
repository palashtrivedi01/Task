package com.strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(6);
        list1.add(3);
        list1.add(4);

        List<Integer> intersection = list.stream()
                .filter(list1::contains)
                .collect(Collectors.toList());

        System.out.println("Intersection: " + intersection);
    }


    }

