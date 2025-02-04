package Sorting_Algorithm;
import java.util.Scanner;
public class Insertion_Sort {
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
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { // 0th index wala element phele se sorted hoga....
            for (int j = i; j > 0 ; j--){ // compare krne time uska current index kya hai....
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    /* SPACE COMPLEXITY --> O(1)
      TIME COMPLEXITY -->
      WORST CASE --> O(n^2)
      BEST CASE --> O(n) -->> already sorted
      AVERAGE CASE --> O(n^2)
   */

    static void insertionSort1(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { // 0th index wala element phele se sorted hoga....
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                swap(arr, j, j-1);
                j--;
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
//        insertionSort(arr);
        insertionSort1(arr);
        printArray(arr);
    }
}
