import java.util.Scanner;

//Question:
//        Write a program that prints the number of even factors of a given integer n.
//
//        Example:
//        Input: 10
//        Output: 2
public class Day6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        evenFactors(n);

    }

    public  static void evenFactors(int n) {

        //getting factors
        for(int i = 1; i <=n; i++){
            if(n%i == 0){
                //checking the factor is even or not
                if(i%2 == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
