
//Question:
//        Write a program that prints only the even elements present at odd indices of a given array of integers.
//
//        Example:
//        Input:
//        6
//        3 4 5 6 8 7 10
//        Output: 4 6

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        evenEleAtOddI( arr);
    }

    public static void evenEleAtOddI(int[] arr) {

        for (int i = 0; i<arr.length; i++){

            if(i%2 != 0){
                if(arr[i]%2 == 0){
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
