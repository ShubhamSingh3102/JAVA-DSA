package ARRAY;
import java.util.Arrays;
import java.util.Scanner;
public class Smallest_Largest_inArray {
        static int[]  smallestAndLargestElement(int[] arr) {
            Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println( arr[i]);
            int [] ans = {arr[0], arr[arr.length - 1]};
            return ans;
//            int [] ans = {arr[k-1], arr[arr.length - k]};
//            return ans;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        int [] ans = smallestAndLargestElement(arr);
        System.out.println("The smallest element is : " + ans[0]);
        System.out.println("The largest element is : " + ans[1]);
    }
}
