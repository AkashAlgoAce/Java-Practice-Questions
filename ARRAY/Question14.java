// Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range
// of indices from l or r( both included )
// Note : The values of l and r in queries follow 1-based indexing.

package ARRAY;
import java.util.Scanner;
public class Question14 {
    static void printarray(int [] arr){
int n = arr.length;
for (int i =1; i< n;i++){
    System.out.print(arr[i]+" ");
}
        System.out.println();
    }

    static int [] prefixsum(int [] arr){
        int n = arr.length;
        for (int i = 1; i <n; i++){
            arr[i] = arr[i-1] + arr[i];

        }
        return arr;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter " + n + " elements of the array : ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();

        }
        int [] prefsum = prefixsum(arr);

        System.out.println("Enter number of queries : ");
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.println("Enter Range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefsum[r] - prefsum[l-1];
            System.out.println("SUM is : "+ans
            );
        }

    }
}