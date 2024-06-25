import java.util.Scanner;

//Question:
//        Write a program that prints the first n two-digit prime numbers.
//
//        Example:
//        Input: 5
//        Output: 11 13 17 19 23
public class Day5 {

    public static void prime(int n){
       int count = 0;
       for(int i = 10 ; i<=99 && count<n; i++){
           if(isPrime(i)){
               System.out.print(i + " ");
               count++;
           }
       }
    }

    public static boolean isPrime(int num){
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
    }
}
