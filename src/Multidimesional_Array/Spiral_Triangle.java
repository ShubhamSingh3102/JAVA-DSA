package Multidimesional_Array;
import java.util.Scanner;
public class Spiral_Triangle {
    static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void Spiral_Triangle(int[][] a,int r,int c) {
        int topRow = 0,bottomRow = r-1,leftCol = 0,rightCol = c-1;
        int totalElements = 0;

        while(totalElements < r*c){

            // topRow--> leftColumn to rightColumn
            for(int j = leftCol; j <= rightCol && totalElements < r*c ;j++){
                System.out.print(a[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            // rightCol--> topRow to bottomRom
                for(int i = topRow; i <= bottomRow && totalElements < r*c;i++){
                    System.out.print(a[i][rightCol] + " ");
                    totalElements++;
                }
                rightCol--;
            // bottomRow--> rightCol to leftCol
                for(int j = rightCol; j >= leftCol && totalElements < r*c;j--){
                    System.out.print(a[bottomRow][j] + " ");
                    totalElements++;
                }
                bottomRow--;
            // leftCol--> bottomRow to topRow
                for(int i = bottomRow; i >= topRow && totalElements < r*c;i--){
                    System.out.print(a[i][leftCol] + " ");
                    totalElements++;
                }
                leftCol++;
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Input matrix: ");
        printMatrix(a);
        System.out.println("Spiral Order: ");
        Spiral_Triangle(a,r,c);

    }
}
