


//Question:
//        Write a program that checks whether a given integer value n ends with 0.
//
//        Example:
//        Input: 1230
//        Output: Yes
public class DayOne {
    public static void main(String[] args) {
        int N=1230;
        if (N % 10 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
