// Question : Given an integer array arr, move all 0's to the end of it while maintaining the relative
//            order of the non-zero elements.
// Note : You must do it in-place without making a copy of the array
// Input : 050342          Output : 534200

package SORTING_ALGORITHMS;

public class Question42 {
    public static void main(String[] args) {
        int [] arr = {0,5,0,3,4,2};
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            for (int j =0; j<n-i-1; j++){
                if (arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
