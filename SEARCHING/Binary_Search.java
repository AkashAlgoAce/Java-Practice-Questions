package SEARCHING;
public class Binary_Search {
    static void display(int [] arr){
        for(int var : arr){
            System.out.print(var + " ");
        }
    }
    static boolean findTarget(int [] arr, int target){
        int n = arr.length;
        int st = 0, end = n-1;
        while(st <= end){
            int mid = (st + end)/2;
            if (target == arr[mid]) return true;
            else if(target > arr[mid]) {
                st = mid + 1;
            }else {end = mid -1;}
        }
        return false;
    }
    static boolean recBinarySearch(int [] arr, int st, int end, int target){
        if(st > end) return false;  // base case
        int mid = (st+end)/2;
        if (target == arr[mid]) return true;  // self work
        else if (target < arr[mid]) {
            return recBinarySearch(arr,st,mid-1,target);  // sub problem
        }else return recBinarySearch(arr,mid+1,end,target);  // sub problem
    }
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9};
        for (int target = 0; target< 10; target++) {
            System.out.println(target+" exists in arr : "+findTarget(arr, target));
            System.out.println(target+" exists in arr : "+recBinarySearch(arr, 0, arr.length - 1, target));
            System.out.println();
        }
//        display(arr);
    }
}
