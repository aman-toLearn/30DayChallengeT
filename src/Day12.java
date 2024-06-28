//Question:
//        Write a program that prints the absolute sum of all elements present in a given array of integers.
//
//        Example:
//        Input:
//        6
//        1 -4 -6 3 10 -20
//        Output: 44

import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
        }

        int absSum = absSum(size,arr);
        System.out.println(absSum);
    }

    public  static int absSum(int size, int[] arr) {
        int absSum = 0;

        for (int i = 0; i<size; i++){
            absSum+= arr[i]>0?arr[i]:-arr[i];
        }

        return absSum;
    }
}
