

//Question:
//        Write a program that prints all the odd numbers in the range n to m.
//
//        Example:
//        Input: 15 30
//        Output: 15 17 19 21 23 25 27 29

import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i<=m; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}
