
//Question:
//        Write a program that prints the product of all even elements present in a given array of integers.
//
//        Example:
//        Input:
//        5
//        6 9 28 7 21
//        Output: 168

import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

       int result =  productOfEven(size,arr);
        System.out.println(result);
    }

    public static int productOfEven(int size, int[] arr) {

        int product = 1;

        for (int i = 0; i<size; i++){
            if(arr[i] == 0){
                continue;
            }
            if(arr[i]%2 == 0){
                product = product*arr[i];
            }
        }

        return product;
    }
}
