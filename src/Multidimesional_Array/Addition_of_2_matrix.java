package Multidimesional_Array;
import java.util.Scanner;
public class Addition_of_2_matrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void add(int r1, int c1, int r2, int c2,int [][] matrix1,int [][] matrix2) {
        if(r1!=r2 || c1!=c2) {
            System.out.println("Invalid Input--Addition not possible");
            return;
        }
        else{
            int[][] sum = new int[r1][c1];
            for(int i=0; i<r1; i++) {
                for(int j=0; j<c1; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Sum of Matrix is : ");
            printMatrix(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array row");
        int row1 = sc.nextInt();
        System.out.println("Enter the first array column");
        int col1 = sc.nextInt();
        int [][] matrix1 = new int[row1][col1];
        System.out.println("Enter matrix elements");
        for(int i=0; i<row1; i++) {
            for(int j=0; j<col1; j++) {
                matrix1[i][j] = sc.nextInt();
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the second array row");
        int row2 = sc.nextInt();
        System.out.println("Enter the second array column");
        int col2 = sc.nextInt();
        int [][] matrix2 = new int[row2][col2];
        System.out.println("Enter matrix elements");
        for(int i=0; i<row2; i++) {
            for(int j=0; j<col2; j++) {
                matrix2[i][j] = sc.nextInt();
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        add(row1, col1, row2, col2, matrix1, matrix2);
    }
}
