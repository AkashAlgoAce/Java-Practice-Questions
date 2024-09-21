// Find the second largest number in the given array

package ARRAY;
import java.util.Scanner;
public class Question4 {

    static int findmax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int secondmax(int [] arr){
        int mx = findmax(arr);
        int n = arr.length;
        for (int i = 0 ; i <n ; i++){
            if (arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findmax(arr);
        return secondmax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements of array :");
        for (int i = 0; i<n;i++){
            System.out.print("Entre "+(i+1)+" element of the array : ");
            arr[i] = sc.nextInt();



        }
        System.out.print("Second largest number is : "+secondmax(arr));

    }
}
 