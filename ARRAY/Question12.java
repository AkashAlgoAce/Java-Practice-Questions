// Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted
// in non-decreasing order.

package ARRAY;
import java.util.Scanner;
public class Question12 {

    static int[] reversearray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];

        }
        return ans;
    }

    static void printarray(int [] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int [] sortsquares(int [] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        int [] ans = new int[n];
        int k = 0;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
             ans[k++] = arr[left] * arr[left];
             left++;

            }
            else {ans[k++] = arr[right] * arr[right];
            right--;}
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" elements of the array : ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        printarray(arr);
        int [] ans = sortsquares(arr);
        int [] reverse = reversearray(ans);
        System.out.println("Sorted Array : ");
        printarray(reverse);

    }
}
