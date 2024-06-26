package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {
        String[] names = {"aman" , "vk","dk","rs"};
        //first way
        List<String> list = Arrays.asList(names);
        System.out.println(list);

        //second way
        List<String> l = new ArrayList<>();
          Collections.addAll(l, names);
        System.out.println(l);

        //Third way using add()
        List <String> l1 = new ArrayList<>();
        for(String s: names){
            l1.add(s);
        }
        System.out.println(l1);

    }
}
