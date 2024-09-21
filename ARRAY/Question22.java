//Given a positive integer n, generate an nxn matrix filled with elements from 1 to n^2 in spiral order

package ARRAY;
import java.util.Scanner;
public class Question22 {

    static int [][] printspiral(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;
        while (current <= (n * n)) {
            // topRow --> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                matrix[topRow][j] = current;
                current++;
            }
            topRow++;

            // rightCol --> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                matrix[i][rightCol] = current;
                current++;
            }
            rightCol--;
            // bottomRow --> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                matrix[bottomRow][j] = current;
                current++;
            }
            bottomRow--;

            // leftCol --> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                matrix[i][leftCol] = current;
                current++;
            }
            leftCol++;
        }
        return matrix;
    }

    static void print_matrix(int [][] matrix){
        for (int i = 0; i< matrix.length;i++){
            for (int j = 0 ; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
//        int c = sc.nextInt();
//        int [][] matrix = new int[r][c];
//        System.out.println("Enter "+(r*c)+" elements of the matrix : ");
//        for (int i = 0; i<r;i++){
//            for (int j = 0 ; j<c; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Input Matrix is : ");
//        print_matrix(matrix);

        System.out.println("Spiral Matrix : ");
       int [][] matrix = printspiral(n);
       print_matrix(matrix);
    }
    }
