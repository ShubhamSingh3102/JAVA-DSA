package ARRAY;
import java.util.*;
public class Array_Reference {
    static void PrintArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("Original Array");
        PrintArray(arr);

        // trying to copy arr to arr2

//        int[] arr2 = Arrays.copyOf(arr, arr.length);

        int[] arr2 = Arrays.copyOfRange(arr, 0, arr.length);

        // int [] arr2 = arr ----> shallow copy
//        int[] arr2 = arr.clone(); // deep copy
        System.out.println("Copied array");
        PrintArray(arr2);



        // changing some value of arr[2]

        arr2[0] = 0;
        arr2[1] = 0;

        System.out.println("Original array after changing arr2");
        PrintArray(arr);

        System.out.println("Copied array after changing arr2");
        PrintArray(arr2);
        }
    }
