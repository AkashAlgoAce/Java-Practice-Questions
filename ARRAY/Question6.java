//1. Given 2 integers swap a and b. Swap the 2 given values using temporary variables.
//2. Given 2 integers swap a and b. Swap the 2 given values without using temporary variables.

package ARRAY;
import java.util.Scanner;
public class Question6 {

    static void without3var(int a, int b){
        System.out.println("Original values before swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Values after swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    static void swap(int a, int b ){
        System.out.println("Original values before swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Values after swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

//        swap(a,b);
        without3var(a,b);
    }
}
