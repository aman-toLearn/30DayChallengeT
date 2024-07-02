

//Question:
//        Write a program that prints all the prime numbers present in a given array of integers.
//
//        Example:
//        Input:
//        5
//        7 9 10 11 19
//        Output: 7 11 19

import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        primePrints(arr);
    }

    public static void primePrints(int[] arr) {

        for (int i = 0; i<arr.length; i++){
            if(Day5.isPrime(arr[i])){
                System.out.println(arr[i]+ " ");
            }
        }
    }
}
