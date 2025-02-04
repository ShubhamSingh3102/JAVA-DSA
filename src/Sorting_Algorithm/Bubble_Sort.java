package Sorting_Algorithm;
import java.util.*;
public class Bubble_Sort {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* SPACE COMPLEXITY --> O(1)
       TIME COMPLEXITY -->
       WORST CASE --> O(n^2)
       BEST CASE --> O(n^2) -->> already sorted
       AVERAGE CASE --> O(n^2)
    */

    static void BubbleSort(int[] arr){
        int n = arr.length;
        // n-1 iterations/passes
        // i = 0 to i = n-2 chezze chl rhi h...
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    /* Optimised Code for nearly sorted array
       WORST CASE --> O(n^2)
       BEST CASE --> O(n) -->> already sorted...
       AVERAGE CASE --> O(n^2)
     */
    static void BubbleSortOptimised(int[] arr){
        int n = arr.length;
        // n-1 iterations/passes
        for(int i=0; i<n-1; i++){
            boolean flag = false; // no swapping happened
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    flag = true; // swapping happened
                }
            }
            if(flag == false){
                return; // already sorted array....
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println("The sorted array is:");
//        BubbleSort(arr);
        BubbleSortOptimised(arr);
        printArray(arr);
    }
}
