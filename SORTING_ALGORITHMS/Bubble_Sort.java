package SORTING_ALGORITHMS;
public class Bubble_Sort {
    static void bubbleSort(int [] arr){
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            for (int j = 0; j< n-1; j++){

                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {4,2,1,4,9,5,4,3,2,33};
        bubbleSort(arr);
        for (int j : arr) System.out.print(j+" ");


    }
}
