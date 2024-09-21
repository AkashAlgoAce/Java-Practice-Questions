package SORTING_ALGORITHMS;

public class Question44 {
    static void sortArr(int [] arr){
        int n = arr.length;
        int x = -1, y = -1;

        if (n <= 1){
            return;
        }
        //process all adjacent elements
        for (int i = 1; i<n; i++){
            if(arr[i-1] > arr[i]){
                if (x==-1){
                    x = i-1;
                    y = i;
                }else y = i;
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void displayArray(int [] arr){
        for (int val : arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = { 10,5,6,7,8,9,3};
        sortArr(arr);
        displayArray(arr);
    }
}
