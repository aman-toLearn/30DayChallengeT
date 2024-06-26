package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class B_DuplicateElements {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,6,6,3,4};
        boolean temp = false;

        Set<Integer> unique = new HashSet<>();

        for (int j : arr) {
            if (unique.contains(j)) {
                temp = true;
                System.out.print(j + " ");
            } else {
                unique.add(j);
            }
        }
        if(!temp){
            System.out.println("No duplicates ");
        }
    }
}
