package com.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,23,4,34,34,2,1,5,6};

        Set<Integer> s = new LinkedHashSet<>();

        for (int i = 0; i< arr.length; i++){

                s.add(arr[i]);

        }

        int[] ar = new int[s.size()];
int i = 0;
        for(int j :s){
            ar[i] = j;
            i++;

        }

      for(int k = 0 ; k<ar.length; k++){
          System.out.print(ar[k]+" ");
      }

    }
}
