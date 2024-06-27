package com.arrays;

import java.util.Scanner;

public class DeleteElementFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();

        deleteElement(pos,arr,size);
    }

    public static void deleteElement(int pos,int[] arr,int size) {

        for(int i = pos-1; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;


        for(int i =0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
