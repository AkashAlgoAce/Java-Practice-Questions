//Reverse an array consisting of integer values

package ARRAY;
import java.util.Scanner;
public class Question7 {

    static void  printarray(int [] arr){
        int n = arr.length;
        for (int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] reversearray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of array :");
        for (int i = 0; i < n; i++) {
            System.out.print("Entre " + (i + 1) + " element of the array : ");
            arr[i] = sc.nextInt();
        }

        int [] ans = reversearray(arr);
        System.out.println("Reverse array is : ");
        printarray(ans);
    }
}
