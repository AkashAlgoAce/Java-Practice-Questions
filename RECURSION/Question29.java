// Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer

package RECURSION;
import java.util.Scanner;
public class Question29 {
    static int series(int n ){
        if (n == 0) return 0;
        if (n%2 == 0) return series(n-1) - n;
        else return series(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(series(n));
    }
}
