

//Question:
//        Write a program that checks if a given number is a 3-digit number and divisible by both 3 and 5.


import java.util.Scanner;

public class DayTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        //checking number is 3 digit or not
        boolean isThreeDigit = input>=100 && input <=999;
        boolean isDivisible = input%3 ==0 && input%5 ==0;

        if(isThreeDigit && isDivisible){
            System.out.println(input + "  Yes, it is a 3-digit number and divisible by both 3 and 5.");
        }
        else {
            System.out.println("Not matches the conditions");
        }

    }
}
