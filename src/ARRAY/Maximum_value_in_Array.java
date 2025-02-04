package ARRAY;
import java.util.Scanner;
public class Maximum_value_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        System.out.println("Enter the elements of array");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("Maximum elements in the array is "+ans);
    }
}
