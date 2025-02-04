package ARRAY;
import java.util.Scanner;
public class Rotate_array_by_k_steps {
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // for rotation
        int[] ans = new int[n];
        int j = 0;

        for(int i=n-k;i<n;i++){
            ans[j++] = arr[i];
        }

        for(int i=0;i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr,int i , int j) {
//        int i = 0, j = arr.length - 1;
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    // rotate without using extra place....inplace rotation

    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array : ");
        printArray(arr);
        rotateInPlace(arr,k);
//        int[] ans = rotate(arr, k);
        System.out.println("Rotated array : ");
        printArray(arr);
    }
}
