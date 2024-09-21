//Sum of Rectangle using Brute force method
// Question : Given a matrix 'a' of dimensions nxm and 2 coordinates (l1,r1) and (l2,r2).
// Return the sum of the rectangle from (l1,r1) to (l2,r2)

package ARRAY;
import java.util.Scanner;
public class Question23 {

    static int findsum(int [][] matrix , int l1, int r1, int l2, int r2){
        int sum =0;
        for (int i = l1;i<=l2;i++){
            for (int j = r1;j<=r2;j++){
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    static void findprefixsum(int [][] matrix ){
        int r = matrix.length;
        int c = matrix[0].length;
        // traverse horizontally to calculate row-wise

        for (int i = 0; i<r; i++){
            for (int j = 1 ; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    static int findsum2(int [][] matrix , int l1, int r1, int l2, int r2){
        int sum = 0;
        findprefixsum(matrix);
        for (int i = l1;i<= l2;i++) {
            // r1 to r2 sum for row i
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else
                sum += matrix[i][r2];
        }
        return sum;

    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter rows and columns of Matrix : ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];
            System.out.println("Enter " + (r * c) + " elements of the matrix : ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter boundaries of rectangle l1, r1, l2, r2 : ");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println("Rectangle sum is " + findsum(matrix, l1, r1, l2, r2));
// Method 2 : Pre-Calculating the horizontal sum for each row in the matrix
            System.out.println("Rectangle sum is " + findsum2(matrix, l1, r1, l2, r2));
        }

}




