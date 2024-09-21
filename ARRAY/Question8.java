// Rotate the given array 'a' by k steps, where k is non-negative.
// Note : k can be greater than n as well

package ARRAY;
import java.util.Scanner;
public class Question8 {
    static void  printarray(int [] arr){
        int n = arr.length;
        for (int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
static int [] rotate(int [] arr, int k ){
    int n = arr.length;
    k = k%n;
    int [] ans = new int[n];
    int j = 0;

    for (int i = n-k; i<n; i++){
        ans[j++] = arr[i];
    }
    for (int i = 0; i<n-k; i++){
        ans[j++] = arr[i];
    }
    return ans;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements of array :");
        for (int i = 0; i<n;i++) {
            System.out.print("Entre " + (i + 1) + " element of the array : ");
            arr[i] = sc.nextInt();
        }

            System.out.print("Enter the value of k : ");
            int k = sc.nextInt();

            System.out.println("Original Array : ");
            printarray(arr);
            int [] ans = rotate(arr, k);
            System.out.println();
            System.out.println("After Rotation : ");
            printarray(ans);
        }
    }

