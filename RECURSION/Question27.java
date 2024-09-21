// Given two numbers p & q, find the value of p^q using a recursive function

package RECURSION;
import java.util.Scanner;
public class Question27 {
    static int power(int p, int q){
        if (q == 0){
            return 1;
        }
        return power(p,q-1) * p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Value of "+a+" to the power "+b+" is "+power(a,b));
    }
}
