import java.util.Scanner;

//Question:
//        Write a program that prints all the multiples of n up to x.
//
//        Example:
//        Input: 5 30
//        Output: 5 10 15 20 25 30
public class Day7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        multiples(n,x);
    }

    public  static void multiples(int n, int x) {

        for (int i = n; i<=x; i++){
            if(i%n == 0){
                System.out.print(i + " ");
            }
        }
    }
}
