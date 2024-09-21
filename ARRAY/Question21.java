// Spiral order traversal

package ARRAY;
import java.util.Scanner;
public class Question21 {

    static void printspiral(int [][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalelements = 0;
        while (totalelements < (r*c)){
            // topRow --> leftCol to rightCol
            for (int j = leftCol; j<= rightCol && totalelements< r*c; j++ ){
                System.out.println(matrix[topRow][j]);
                totalelements++;
            }
            topRow++;

            // rightCol --> topRow to bottomRow
            for (int i = topRow ; i<= bottomRow && totalelements< r*c; i++){
                System.out.println(matrix[i][rightCol]);
                totalelements++;
            }
            rightCol--;
            // bottomRow --> rightCol to leftCol
            for (int j = rightCol; j>= leftCol && totalelements< r*c; j--){
                System.out.println(matrix[bottomRow][j]);
                totalelements++;
            }
            bottomRow--;

            // leftCol --> bottomRow to topRow
            for (int i = bottomRow; i>= topRow && totalelements< r*c; i--){
                System.out.println(matrix[i][leftCol]);
                totalelements++;
            }
            leftCol++;
        }
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
        System.out.println("Enter rows and columns of Matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
int [][] matrix = new int[r][c];
        System.out.println("Enter "+(r*c)+" elements of the matrix : ");
        for (int i = 0; i<r;i++){
            for (int j = 0 ; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix is : ");
        print_matrix(matrix);

        System.out.println("Spiral Matrix : ");
        printspiral(matrix,r,c);
    }
}
