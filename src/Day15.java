import java.util.Scanner;

//Question:
//        Write a program that prints the maximum product of pairs present in a given array of integers.
//
//        Example:
//        Input:
//        8
//        -2 6 5 -4 7 -8 9 3
//        Output: 63
public class Day15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

      int result =   maximumProduct(arr);
        System.out.println(result);
    }

    private static int maximumProduct(int[] arr) {

        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }
}
