//Question : Given a square matrix, turn it 90 degrees in clockwise direction without using any extra space

package ARRAY;
import java.util.Scanner;
public class Question19 {
    static void printMatrix(int [][] arr ){
        for (int i = 0;i< arr.length;i++){
            for (int j = 0 ; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverse(int [] arr){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
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

    static void rotate(int [][] arr,int n){
        transposeinplace(arr,n,n);
        for (int i =0 ; i<n;i++){
            reverse(arr[i]);
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

        System.out.println("Rotated Matrix is : ");
        rotate(arr,r);
        printMatrix(arr);

    }
}
