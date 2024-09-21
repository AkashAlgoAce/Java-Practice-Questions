//Given an integer n return the first n rows of Pascal's triangle, each number is the sum of the two numbers
//directly above it

package ARRAY;
import java.util.Scanner;
public class Question20 {
    static void printMatrix(int [][] arr ){
        for (int i = 0;i< arr.length;i++){
            for (int j = 0 ; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int [][] pascaltriangle(int n){
        int [][] ans = new int [n][];
        for (int i = 0; i < n ; i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1;j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int [][] ans = pascaltriangle(n);
        printMatrix(ans);
    }
}