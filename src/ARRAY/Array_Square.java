package ARRAY;
import java.util.Scanner;
public class Array_Square {
    static void printArray(int[] arr){
        for(int i  = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    static void reverseArray(int[] arr){
//        int i = 0, j = arr.length - 1;
//        while(i < j){
//            swap(arr, i, j);
//            i++;
//            j--;
//        }
//    }
    static int[] sortSquareArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int[] ans = new int[n];
        int k = n-1;

        while(i<=j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k--] = arr[i]*arr[i];
                i++;
            }else{
                ans[k--] = arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
//    static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    static void sortArray(int[] arr){
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i + 1; j < arr.length; j++){
//                if(arr[i] > arr[j]){
//                    swap(arr, i, j);
//                }
//            }
//        }
//    }
//    static int[] squareArray(int[] arr){
//        int n = arr.length;
//        int[] ans = new int[n];
//        for(int i = 0; i < n; i++){
//            ans[i] = arr[i] * arr[i];
//        }
//        return ans;
//    }
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
//        sortArray(arr);
        int [] ans= sortSquareArray(arr);
        System.out.println("Square array after sorting is : ");
//        reverseArray(ans);
        printArray(ans);
    }
}
