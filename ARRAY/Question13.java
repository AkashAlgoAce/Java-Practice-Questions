// PREFIX SUM APPROACH
// Question : Given an integer array 'a', return the prefix sum/running sum in the same array without creating a new array

package ARRAY;
import java.util.Scanner;
public class Question13 {
    static void printarray(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++){
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
        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements of the array : ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array : ");
        printarray(arr);
        System.out.println("Prefix sum array : ");
        int [] prefix = prefixsum(arr);
        printarray(prefix);
    }
}
