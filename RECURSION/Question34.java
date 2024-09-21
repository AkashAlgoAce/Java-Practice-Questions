// Given an array of n integers and a target value x. Print whether x exists in the array or not ( Linear Search )

package RECURSION;
import java.util.Scanner;
public class Question34 {
    static boolean search(int [] arr, int n,int target, int idx){
if (idx >= n) return false;
if (arr[idx] == target) return true;
return search(arr, n, target, idx + 1);
    }
    static int find_index(int [] arr, int n,int target, int idx){
        if (idx >= n) return -1;
        if (arr[idx] == target) return idx;
        return find_index(arr, n, target, idx + 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};
        int target = 4;
//        if (search(arr, arr.length, target,0))System.out.println("Yes");
//        else System.out.println("No");
        System.out.println(find_index(arr,arr.length,target,0));

    }
}
