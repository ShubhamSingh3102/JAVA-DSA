package Multidimesional_Array;
import java.util.Scanner;
public class Basics1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows");
        int m = sc.nextInt();
        System.out.println("Enter the size of the columns");
        int n = sc.nextInt();
        int [][] arr = new int[m][n];
        System.out.println("Enter the elements of the multidimensional array:");
        for(int i = 0;i < m ;i++){
            for(int j = 0;j < n;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
