package ARRAY;
import java.util.Scanner;
public class Reverse_an_array {
//    static void Reverse(int[] arr){
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.println(arr[i]);
//        }
//    }

//    now using inplace method(without using new array reverse the array)

    static void printArray(int[] arr){
        for(int i= 0;i<= arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse_an_array(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
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
//        Reverse(arr);
        reverse_an_array(arr);
        printArray(arr);
    }
}
