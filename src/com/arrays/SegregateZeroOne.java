package com.arrays;

public class SegregateZeroOne {

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1,0,1,1,0};

        int low = 0;
        int high = arr.length-1;
        while(low<high){
            if(arr[low] == 0 && arr[high] ==1){
                low++;
                high--;
            } else if (arr[low] ==1 && arr[high] ==0) {
                int temp = arr[high];
                arr[high]= arr[low];
                arr[low] = temp;
            } else if (arr[low] == 1 && arr[high] ==1) {
                high--;
            } else if (arr[low] == 0 && arr[high] ==0) {
                low++;
            }
        }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
