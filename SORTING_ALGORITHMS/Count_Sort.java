package SORTING_ALGORITHMS;
public class Count_Sort {
    static int findMax(int [] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>mx){
                mx = arr[i];}}return mx;
    }
    static void basicCountSort(int [] arr){
        int max = findMax(arr);
        int [] count = new int[max+1];
        for (int i =0;i<arr.length;i++){
            count[arr[i]]++;}
        int k = 0;
        for (int i = 0; i< count.length;i++){
            for (int j = 0; j<count[i]; j++){
                arr[k++] = i;
            }
        }
    }

    static void countSort(int [] arr ){
        int n = arr.length;
        int [] output = new int[n];
        int max = findMax(arr);
        int [] count = new int[max + 1];
        for (int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }
        for (int i = 1; i< count.length; i++){
            count[i] += count[i-1];
        }
        for (int i = n-1; i>=0;i--){
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0 ; i<n; i++){
            arr[i] = output[i];
        }
    }
    static void display(int [] arr){for(int val : arr) System.out.print(val+" ");}
    public static void main(String[] args) {
        int [] arr = {1,8,6,5,3,5,7,8,2,3,4,5,7,4};
//        basicCountSort(arr);
        countSort(arr);
        display(arr);
    }
}
