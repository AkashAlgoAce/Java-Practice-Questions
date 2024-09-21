// Given an array of size N and an integer X. The task is to find all the indices of the integer X in the array

package RECURSION;
import java.util.ArrayList;
import java.util.Scanner;
public class Question35 {
// This method returns a ArrayList of the indices ;
    static ArrayList<Integer> all_indices(int[] a, int n, int x, int idx) {
        if (idx >= n) return new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (a[idx] == x) ans.add(idx);
        ArrayList<Integer> small_ans = all_indices(a, n, x, idx + 1);
        ans.addAll(small_ans);
        return ans;
    }
    static void find_all_indices(int [] a, int n, int target, int idx){
        if (idx>=n) return;
        if (a[idx] == target) System.out.println(idx+" ");
        find_all_indices(a,n,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,2,3,4,3,2,3,3};
        int target = 3;
        find_all_indices(arr,arr.length,target,0);
        System.out.println(all_indices(arr,arr.length,target,0));
    }
}
