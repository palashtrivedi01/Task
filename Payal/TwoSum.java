package com.example.AdvanceInheritance;

import java.util.HashMap;
import java.util.OptionalInt;
import java.util.Map;
import java.util.stream.IntStream;

public class Arts {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 6, 4 };
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        OptionalInt result = IntStream.range(0, nums.length)
                .filter(i -> {
                    int comp = target - nums[i];
                    if (map.containsKey(comp)) {
                        System.out.println(map.get(comp) + " " + i);
                        return true;
                    }
                    map.put(nums[i], i);
                    return false;
                }).findFirst();
    }
}
