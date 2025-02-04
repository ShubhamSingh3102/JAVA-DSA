package Multidimesional_Array;
import java.util.Scanner;
public class Transpose_of_matrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] Transpose(int[][] matrix,int r,int c){
        int[][] ans = new int [c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    // only for square matrix...
    static void TransposeInPLace(int[][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        int [][] matrix = new int [r][c];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Input Matrix: ");
        printMatrix(matrix);
//        int[][] ans = Transpose(matrix,r,c);
//        System.out.println("Transpose of Matrix: ");
//        printMatrix(ans);
        System.out.println("Transpose Matrix: ");
        TransposeInPLace(matrix,r,c);
        printMatrix(matrix);
    }
}
