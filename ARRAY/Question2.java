// Find the total number of triplets in the array whose sum is equal to the given value

package ARRAY;
import java.util.Scanner;
public class Question2 {
    static int tripletsum(int []arr, int target){
        int n = arr.length;
        int ans = 0;

        for (int i =0; i<n;i++){
            for (int j = i+1;j<n;j++){
                for (int k = j+1;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter the elements of Array : ");
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter targeted sum : ");
        int target = sc.nextInt();

        System.out.print("Answer is : "+tripletsum(arr,target));
    }
}
