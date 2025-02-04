package ARRAY;
import java.util.Scanner;
public class Range_Sum_Query {
    static void printArray(int[] arr){
        for(int i  = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] Prefix(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the  number of queries : ");
        int q = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter elements of array: ");
        // 1 indexing array
        for (int i = 1; i <= arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefix = Prefix(arr);
        while (q-- > 0) {
            System.out.println("Enter the left range value : ");
            int left = sc.nextInt();
            System.out.println("Enter the right range value : ");
            int right = sc.nextInt();

            int ans = prefix[right] - prefix[left-1];
            System.out.println("Sum" + ans);
        }
    }
}
