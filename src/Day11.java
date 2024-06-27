
//Question:
//        Write a program that prints the index of the smallest element present in a given array of integers.
//
//        Example:
//        Input:
//        5
//        5 6 4 8 9
//        Output: 2

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

       int result =  indexOfSE(size,arr);
        System.out.println(result);
    }

    public static int indexOfSE(int size, int[] arr) {
        int index = 0;
        int smallest = arr[index];

        for (int i = 1; i<size; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
                index = i;
            }
        }

       return index;
    }
}
