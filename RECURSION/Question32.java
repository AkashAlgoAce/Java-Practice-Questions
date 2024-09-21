// Find greater value of the array

package RECURSION;
import java.util.Scanner;
public class Question32 {

    static int maxInArray(int [] arr, int idx){
        if (idx == arr.length-1) return arr[idx];
        int smallAns = maxInArray(arr,idx+1);
        return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {3,10,3,2,5,12,15};
        System.out.println(maxInArray(arr,0));
    }
}
