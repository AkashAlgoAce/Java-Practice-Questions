// TOPIC : Array Manipulation
// Question : Find the unique number in a given Array where all the elements are being repeated twice with one
//            value being unique. ( *only positive elements in array )

package ARRAY;
import java.util.Scanner;
public class Question3 {
    static int findunique(int [] arr){
        int n = arr.length;

        for (int i = 0 ; i<n ; i++){
            for (int j = i+1 ; j < n; j++){
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for (int i = 0 ; i < n ; i++){
            if (arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
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
        System.out.print("Unique numbers is : "+findunique(arr));
    }
}
