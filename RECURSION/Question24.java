// Finding factorial using recursion

package RECURSION;
import java.util.Scanner;
public class Question24 {

    static int factorial(int n){
        if(n == 0 )
            return 1;
        return n*factorial(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
//        System.out.println(factorial(n));
        System.out.println("The factorial of "+n+" is : "+factorial(n) );
    }
}
