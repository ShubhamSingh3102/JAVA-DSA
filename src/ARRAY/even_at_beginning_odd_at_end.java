package ARRAY;
import java.util.Scanner;
public class even_at_beginning_odd_at_end {
    static void printArray(int[] arr){
        for(int i  = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void move(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while(i < j){
            if(arr[i] % 2 != 0 && arr[j] % 2 == 0 ){
                swap(arr, i, j);
                i++;
                j--;
            }
            if(arr[i] % 2 == 0 ){
                i++;
            }
            if(arr[j] % 2 != 0 ){
                j--;
            }
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
        }
        printArray(arr);
        move(arr);
        printArray(arr);
    }
}
