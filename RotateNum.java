package com.strings;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateNum {



        public static void main(String[] args) {

            List<Integer> obj = Arrays.asList(1,2,33,53,56,766);
            Collections.rotate(obj, 3);
            System.out.println(obj);

        }

    }


