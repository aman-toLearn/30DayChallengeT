import java.util.Scanner;

//Question:
//        Write a program to count the number of even digits present in a given integer value n.
//
//        Example:
//        Input: 25436
//        Output: 3
public class Day9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int count = 0;
        while(n>0){
            int digit = n%10 ;
            if(digit%2 == 0){
//                System.out.println(digit + " ");
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
