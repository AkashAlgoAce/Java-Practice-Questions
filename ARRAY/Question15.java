// Check if we can partition the array into two subarrays with equal sum. More formally,check that the prefix
// sum of a part of the array is equal to the suffix sum of rest of the array.

package ARRAY;
import java.util.Scanner;
public class Question15 {
    static int findsum(int [] arr){
        int totalsum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalsumpartition(int [] arr){
        int totalsum = findsum(arr);
        int prefsum = 0;
        for (int i=0;i<arr.length;i++){
            prefsum += arr[i];
            int suffixsum = totalsum - prefsum;
            if(suffixsum == prefsum){
                return true;
            }
        }
        return false;
    }

    static void printarray(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements of the array : ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array : ");
        printarray(arr);

        System.out.println("Equal sum partition possible : "+equalsumpartition(arr));
    }
}
