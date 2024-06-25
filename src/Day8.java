import java.util.Scanner;

//Question:
//        Write a program that prints the Least Common Multiple (LCM) of two given integer values.
//
//        Example:
//        Input:
//        12
//        18
//        Output: 36
public class Day8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int lcm = (n*m)/hcf(n,m);

        System.out.println(lcm);
    }

    public  static int hcf(int n, int m) {
        int hcf = 0;
        int min = Math.min(n, m);

        for (int i = 1; i <= min; i++)
        {
            if (n % i == 0 && m % i == 0)
                hcf =  i;
        }
        return hcf;
    }
}
