// Print array using recursion

package RECURSION;
import java.util.Scanner;
public class Question31 {
    static void printarr(int [] arr, int idx){
        if (idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printarr(arr,idx + 1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] arr = {2,3,4,5,6};
        System.out.println("Enter number of elements of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the "+n+" elements of the array : ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printarr(arr, 0);
    }
}
