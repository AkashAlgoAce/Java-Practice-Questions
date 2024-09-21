//Given an array of size N containing only 0s,1s ans 2s; sort the array in ascending order
package SORTING_ALGORITHMS;
public class Question46 {
    static void displayArray(int [] arr){
        for (int val : arr){
            System.out.print(val+" ");
        }
    }
    static void swap(int [] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void sort012(int [] arr){
      int lo = 0, mid = 0, hi = arr.length-1;
      while(mid <= hi){
          if (arr[mid] == 0){
              swap(arr,mid,lo);
              mid++;
              lo++;
          }else if (arr[mid] == 1){
              mid++;
          }else{
              swap(arr,mid,hi);
              hi--;
          }

      }
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,2,1,1,1,2,2,0,0,0,0,0,2,2,1,2,0,2,1,0,1,2,0};
        sort012(arr);
        displayArray(arr);
    }
}
