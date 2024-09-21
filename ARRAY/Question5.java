/* Given an array 'a' consisting of integers. Return the first value that is repeating in this array. If no
 value is being repeated, return -1. */

package ARRAY;
import java.util.Scanner;
public class Question5 {

    static int findrepeat(int [] arr){
        int n = arr.length;

        for (int i = 0 ; i < n ; i++){
            for (int j = i + 1 ; j < n ; j++){
                if (arr[i] == arr[j]){
//                    System.out.println(arr[i]);
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.print("First repeating number is : "+findrepeat(arr));

    }
    }

