// Fibonacci series using recursion ( finding nth term )

package RECURSION;
import java.util.Scanner;
public class Question25 {
    static int fib(int n ){
        // base case
        if(n == 0 || n == 1)
            return n;
        return fib(n-1) + fib(n-2);
        // sub problem
//        int prev = fib(n-1);
//        int prevprev = fib(n-2);
//
//        // self work
//        return prev + prevprev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(n+"th term is : "+ fib(n));

//        for (int i = 0 ; i< n; i++){
//            System.out.print(fib(i) + ", ");
//        }
    }
}
