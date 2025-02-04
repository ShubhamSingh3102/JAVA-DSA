package Multidimesional_Array;
import java.util.Scanner;
public class Pascal_Triangle {
    static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    // concept of jagged array( in each row there is different number of column)

    static int[][] PascalTriangle(int n) {
        int [][] ans  = new int[n][];

        for (int i = 0; i < n; i++) {
            // ith row has i+1 column....
            // ith row me i+1 column array initialise kr rhe h....
            /*
            ans[0] = new int[1]
             */
            // dynamically column ki spaces mil rhi h...
            // array ke andar aaray....
            ans[i] = new int[i+1];
            // 1st and last element of every row is 1....
            ans[i][0] = 1;
            ans[i][i] = 1;

            // beech me element fill karne ke liye....
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Pascal Triangle");
        int [][] ans = PascalTriangle(n);
        printArray(ans);
    }
}
