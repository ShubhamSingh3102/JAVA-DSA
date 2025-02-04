package ARRAY;
import java.util.Scanner;
public class First_repeating_element {
    static int first_repeating_element(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i]; // sab for loop se bahar nikal jaate h...return ho jata h value...
                }
            }
        }
        return -1;
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
        int first = first_repeating_element(arr);
        System.out.println("First repeating element in the array is " +first);
    }
}
