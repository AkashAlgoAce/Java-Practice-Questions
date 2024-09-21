// Find the sum of the elements of the array

package RECURSION;
import java.util.Scanner;
public class Question33 {
    static int sum_of_array(int [] arr, int idx){
        if (idx == arr.length) return 0;
        int small_ans = sum_of_array(arr,idx+1);
        return small_ans + arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {};
        System.out.println(sum_of_array(arr,0));

    }
}
