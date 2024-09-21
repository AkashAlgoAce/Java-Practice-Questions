// Find the total number of pairs in the array whose sum is equal to the given value

package ARRAY;
import java.util.Scanner;
public class Question1 {
    static int pairsum ( int [] arr, int target ){
        int n = arr.length;
        int ans = 0;

        for (int i =0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if (arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter "+n+" elements : ");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum : ");
        int target = sc.nextInt();
        System.out.print(pairsum(arr,target));
    }
    }

