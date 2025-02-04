package ARRAY;
import java.util.Scanner;
public class Prefix_sum {
    static void printArray(int[] arr){
        for(int i  = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    static int[] prefixSum(int[] arr) {
////        int sum = 0;
////        int n = arr.length;
////        int[] ans = new int[n];
////        for(int i = 0; i < n; i++){
////            sum += arr[i];
////            ans[i] = sum;
////        }
///         // new process---->
///
////        int n = arr.length;
////        int[] prefixSum = new int[n];
////        prefixSum[0] = arr[0];
////        for(int i = 1; i < n; i++){
////            prefixSum[i] = prefixSum[i-1] + arr[i];
////        }
////        return prefixSum;
////    }
//    }
    static int[] prefixSum(int[] arr){
    int n = arr.length;
    for(int i = 1; i < n; i++){
       arr[i] = arr[i-1] + arr[i];
    }
    return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
////        int[] prefixSum = prefixSum(arr);
////        System.out.println("The prefix sum is : ");
//        printArray(prefixSum);
        int[] prefixSum = prefixSum(arr);
        System.out.println("The prefix sum of the given array is : ");
        printArray(prefixSum);
    }
}
