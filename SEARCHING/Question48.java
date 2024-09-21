//Find the square root of the given non-negative value x.Round it off to the nearest floor integer value
package SEARCHING;
public class Question48 {
    static int sqrt(int x){
        int st = 0, end = x;
        int ans = -1;
        while(st <= end){
            int mid = st + ( end - st )/2;
            int val = mid*mid;
            if(x == val){
                return mid;
            } else if (val > x) {
                end = mid-1;
            }else {
                st = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 25;
        System.out.println(sqrt(x));
    }
}
