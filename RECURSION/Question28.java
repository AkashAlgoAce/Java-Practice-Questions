// given a number n and print k multiples of n
// Example : n = 5, k = 4
// output : 5 10 15 20

package RECURSION;
import java.util.Scanner;
public class Question28 {

    static void print_multiples(int n , int k ){
        // base case
        if (k == 1){
            System.out.println(n);
            return;
        }

        // recursive work
        print_multiples(n,k-1);

        // self work
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        print_multiples(n,k);

    }
}
