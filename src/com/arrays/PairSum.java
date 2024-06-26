package com.arrays;

import com.sun.security.jgss.GSSUtil;

// arr[] = {1,2,3,4,5,6}
//k = 11
// output : pair (5,6),
public class PairSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 8;

        int low = 0;
        int high = arr.length-1;

        while(low<high){
            if(arr[low] + arr[high]>k){
                high--;
            } else if (arr[low]+arr[high]<k) {
                low++;
            } else if (arr[low]+arr[high] == k) {
                System.out.println("Pair" + "("+arr[low]+","+arr[high]+")");
                low++;
                high--;
            }
        }
    }
}
