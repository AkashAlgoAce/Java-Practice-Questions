// Transpose of Matrix

package ARRAY;
import java.util.Scanner;
public class Question18 {
    static void printMatrix(int [][] arr ){
        for (int i = 0;i< arr.length;i++){
            for (int j = 0 ; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int [][] arr, int r, int c){
        int [][] ans = new int[c][r];
        for(int i = 0; i<c ; i++){
            for (int j = 0; j<r; j++){
                ans [i][j] = arr[j][i];
            }
        }
        return ans;
    }

    static void transposeinplace(int [][] arr, int r, int c){
        for (int i = 0 ; i< c; i++){
            for (int j = i; j<r;j++){
                // swap arr[i][j], arr[j][i]

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [][] arr = new int[r][c];
        System.out.println("Enter "+(r * c)+" elements of the array : ");
        for (int i = 0; i<r; i++){
            for (int j = 0 ; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix : ");
        printMatrix(arr);

        System.out.println("Transpose of Matrix is : ");
        transposeinplace(arr,r,c);
        printMatrix(arr);
//        int [][] ans = transpose(arr,r,c);
//        printMatrix(ans);
    }
}
