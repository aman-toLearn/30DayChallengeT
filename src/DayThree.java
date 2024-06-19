
//Question:
//        Write a program that checks whether a given integer value n is Positive, Negative, or Zero.
//
//        Example:
//        Input: 50
//        Output: Positive

import java.util.Scanner;

public class DayThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
