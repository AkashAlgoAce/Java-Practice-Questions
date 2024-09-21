//Question based on two-pointer approach
// Question : Sort an array of only 0s ans 1s

package ARRAY;
import java.util.Scanner;
public class Question10 {

    static void printarray(int [] arr){
        int n = arr.length;
        for (int i = 0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void using2pointer(int [] arr){
       int n = arr.length;
        for (int i = 0; i<n; i++){
            for (int j = n-1;j>=i;j-- ){
                if(arr[i] == 1 && arr[j] == 0){
                    swap(arr,i,j);
                }
            }
        }
    }

    static void swap(int [] arr, int i , int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort0and1(int [] arr){
        int n = arr.length;
        int left = 0 , right = n-1;
        while (left < right){
            if (arr[left] == 1 && arr[right]== 0){
                swap(arr,left, right);
                left ++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" elements of the array : ");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        printarray(arr);
//        sort0and1(arr);
        using2pointer(arr);
        System.out.println("Sorted array : ");
        printarray(arr);

    }
}
