// Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the
// odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition

package ARRAY;
import java.util.Scanner;
public class Question11 {

    static void printarray(int [] arr){
        int n = arr.length;
        for (int i = 0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int [] arr, int i , int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortevenandodd(int [] arr){
        int n = arr.length;
        int left =0 , right = n-1;
        while (left < right){
            if (arr[left] %2 != 0 && arr[right] %2 == 0){
                swap(arr,left, right);
                left ++;
                right--;
            }
            if (arr[left]%2 == 0){
                left++;
            }
            if (arr[right]%2 !=0){
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
        sortevenandodd(arr);
//        using2pointer(arr);
        System.out.println("Sorted array : ");
        printarray(arr);

    }
    }
