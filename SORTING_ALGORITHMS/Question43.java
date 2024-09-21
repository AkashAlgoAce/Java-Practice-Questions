//Question : Given an array of names of the fruits, you are supposed to sort it in lexicographical order using
//             the selection sort.


package SORTING_ALGORITHMS;

public class Question43 {
    static void sortFruits(String[] arr){
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            int minIndex = i;
            for (int j = i+1; j<n; j++){
                if (arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }

            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
String [] arr = {"mango","papaya", "kiwi", "apple" };
sortFruits(arr);
for (String val : arr){
    System.out.print(val+", ");
}
    }
}
