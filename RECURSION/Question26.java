//Given an integer, find out the sum of its digits using recursion

package RECURSION;
import java.util.Scanner;
public class Question26 {
    static int sod(int n ){
        // base case
        if (n >= 0 && n <= 9){
            return n;
        }
        return sod(n/10) + (n%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Sum of digits is : "+sod(n));

    }
}
