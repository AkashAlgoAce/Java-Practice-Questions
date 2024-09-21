//Find first and last occurrence of the target number from the array

package SEARCHING;
public class Question47 {
    static int firstOccurrence(int [] arr,int target){
        int st = 0;
        int end = arr.length-1;
        int flag = -1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(target == arr[mid]){
                flag = mid;
                end = mid-1;
            }else if (target < arr[mid]) {
                end = mid-1;
            }else st = mid+1;
        }
        return flag;
    }

    static int lastOccurrence(int [] arr,int target){
        int st = 0;
        int end = arr.length-1;
        int flag = -1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(target == arr[mid]){
                flag = mid;
                st = mid+1;
            }else if (target < arr[mid]) {
                end = mid-1;
            }else st = mid+1;
        }
        return flag;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,5,5,5,5,5,6,6,6};
        int target = 1;
        System.out.println("First Occurrence of "+target+" is : "+firstOccurrence(arr,target));
        System.out.println("Last Occurrence of "+target+" is : "+lastOccurrence(arr,target));
    }
}
