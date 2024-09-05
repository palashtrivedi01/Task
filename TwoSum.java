package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TwoSum {



        public static void main(String[] args) {
            int[] nums = { 4, 3, 9, 12, 4 };
            int target = 12;
            Map<Integer, Integer> map = new HashMap<>();
            OptionalInt result = IntStream.range(0, nums.length)
                    .filter(i -> {
                        int sum = target - nums[i];
                        if (map.containsKey(sum)) {
                            System.out.println(map.get(sum) + " " + i);
                            return true;
                        }
                        map.put(nums[i], i);
                        return false;
                    }).findFirst();
        }
    }

