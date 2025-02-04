package Multidimesional_Array;
import java.util.Scanner;
public class Multiplication_of_2_matrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void MultiplyMatrix(int[][] matrix1, int[][] matrix2,int r1, int c1, int r2, int c2) {
        if(c1!=r2){
            System.out.println("Multiplication not possible");
            return;
                }
        else {
            int[][] product = new int[r1][c2];
            for(int i =0;i<r1;i++){
                for(int j =0;j<c2;j++){
                    for(int k =0;k<c1;k++){
                        // product[i][j] = ith row of a * jth column of b....
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Product of two matrix is :");
            printMatrix(product);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array row");
        int row1 = sc.nextInt();
        System.out.println("Enter the first array column");
        int col1 = sc.nextInt();
        int[][] matrix1 = new int[row1][col1];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the second array row");
        int row2 = sc.nextInt();
        System.out.println("Enter the second array column");
        int col2 = sc.nextInt();
        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
//        printMatrix(matrix1);
//        printMatrix(matrix2);
        MultiplyMatrix(matrix1,matrix2,row1,col1,row2,col2);
    }
}
