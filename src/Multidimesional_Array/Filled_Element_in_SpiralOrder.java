package Multidimesional_Array;
import java.util.Scanner;
public class Filled_Element_in_SpiralOrder {
    static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    // traversing in Spiral Order
    static int[][] Spiral_Triangle(int n) {
        int [][] matrix = new int[n][n];
        int topRow = 0,bottomRow = n-1,leftCol = 0,rightCol = n-1;
        int curr = 1;

        while(curr <= n*n){

            // topRow--> leftColumn to rightColumn
            for(int j = leftCol; j <= rightCol && curr <= n*n ;j++){
               matrix[topRow][j] = curr;
               curr++;
            }
            topRow++;
            // rightCol--> topRow to bottomRom
            for(int i = topRow; i <= bottomRow && curr <= n*n;i++){
               matrix[i][rightCol] = curr;
                curr++;
            }
            rightCol--;
            // bottomRow--> rightCol to leftCol
            for(int j = rightCol; j >= leftCol && curr <= n*n;j--){
                matrix[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--;
            // leftCol--> bottomRow to topRow
            for(int i = bottomRow; i >= topRow && curr <= n*n;i--){
                matrix[i][leftCol] = curr;
                curr++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[][] matrix = Spiral_Triangle(n);
        printMatrix(matrix);
    }
}
