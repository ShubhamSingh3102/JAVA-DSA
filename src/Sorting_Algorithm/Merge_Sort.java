package Sorting_Algorithm;

import java.util.Scanner;

public class Merge_Sort {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void Merging(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] b = new int[high + 1];

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
                } else {
                    b[k] = arr[j];
                    j++;
                }
                k++;
            }
            // Copy remaining elements from either left or right subarray
            while (i <= mid) {
                b[k++] = arr[i++];
            }
            while (j <= high) {
                b[k++] = arr[j++];
            }

            // Copy the merged elements back to the original array
            for (i = low; i <= high; i++) {
                arr[i] = b[i];
            }
        }
        /* SPACE COMPLEXITY --> O(n)
        TIME COMPLEXITY -->
        WORST CASE --> O(n log n)
        BEST CASE --> O(n log n) -->> already sorted
        AVERAGE CASE --> O(n log n)
        */
    static void MergeSort(int[] arr,int low,int high) {
        int mid;
        mid=low+(high-low)/2;
        if(low<high){
            // now recursion will do its job
            MergeSort(arr,low,mid);
            MergeSort(arr,mid+1,high);
            Merging(arr,low,mid,high);
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
        MergeSort(arr,0,n-1);
        printArray(arr);
    }
}
