package Multidimesional_Array;
import java.util.Scanner;
public class Sum_of_Rectangle {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int RectangleSum(int[][] matrix,int l1,int r1,int l2,int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
       return sum;
    }


    // 2nd approach by Rows Prefix Sum.......
    // for 3rd approach calculating row-wise and column-wise prefix sum
    // matrix[i][j] = sumRectangle( (0,0) (i,j))

    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) { // fixing row
            for (int j = 0; j < c; j++) {
                if (j >= 1) {
                    matrix[i][j] += matrix[i][j - 1];
                }
                else{
                    matrix[i][j] = matrix[i][j];
                }
            }
        }
        // traverse vertically to calculate column-wise prefix sum
        for(int j = 0; j < c; j++) { // fixing column
            for (int i = 1; i < r; i++) {
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }
    // row wise prefix sum.....
    static int findSum2(int[][] matrix,int l1,int r1,int l2,int r2) {
        int sum = 0;
        findPrefixSumMatrix(matrix);

        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row i.....
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }
        }
        return sum;
    }


    // 3rd approach by prefix sum over columns and rows both........

    static int findSum3(int[][] matrix,int l1,int r1,int l2,int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;

        findPrefixSumMatrix(matrix);

        // now matrix value is changed

        sum = matrix[l2][r2];
        if(r1 >= 1){
           left = matrix[l2][r1-1];
        }
        if(l1 >= 1) {
            up = matrix[l1 - 1][r2];
        }
        if(l1 >= 1 && r1 >= 1) {
            leftUp = matrix[l1-1][r1-1];
        }

        ans = sum - up - left + leftUp;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);
        System.out.println("Enter the first coordinate l1: ");
        int l1 = sc.nextInt();
        System.out.println("Enter the first coordinate r1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the second coordinate l2: ");
        int l2 = sc.nextInt();
        System.out.println("Enter the second coordinate r2: ");
        int r2 = sc.nextInt();
        int ansSum= RectangleSum(matrix,l1,r1,l2,r2);
//        int ansSum2 = findSum2(matrix,l1,r1,l2,r2);
        int ansSum3 = findSum3(matrix,l1,r1,l2,r2);
        System.out.println("Sum of rectangles is: "+ansSum);
//        System.out.println("Sum of rectangles is: "+ansSum2);
        System.out.println("Sum of rectangles is: "+ansSum3);
    }
}
