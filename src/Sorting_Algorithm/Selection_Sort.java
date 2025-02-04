package Sorting_Algorithm;
import java.util.Scanner;
public class Selection_Sort {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j) {
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

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) { // i represent the current index...(n-2) times krte hai...
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap current element and minimum element...
            swap(arr, i, minIndex);
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
        selectionSort(arr);
        printArray(arr);
    }
}
