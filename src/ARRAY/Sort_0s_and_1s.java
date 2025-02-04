package ARRAY;
import java.util.Scanner;
public class Sort_0s_and_1s {
    static void sort(int[] arr){
        int n = arr.length;
//        for(int i = 1; i < n; i++){
//            for(int j = 0; j < i; j++) {
//                if (arr[j] > arr[i]) {
//                    swap(arr, i, j);
//                }
//            }
//        }
        int zeroes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
        // 0 to zeroes-1 : 0 and zeroes to n-1 : 1
        for(int i = 0; i < n; i++){
            if(i<zeroes){
                arr[i] = 0;
            }else
                arr[i] = 1;
        }
    }
    static void twoPointerSort(int[] arr) {
        int n = arr.length;
        int i = 0; // starting from zero
        int j = n-1; // pointing at end
        while(i<j){
            if(arr[i] == 1 && arr[j] == 0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[] arr){
        for(int i  = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        twoPointerSort(arr);
        printArray(arr);
    }
}
