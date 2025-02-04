package ARRAY;
import java.util.Scanner;
public class Duplicate_Element {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] Remove_Duplicate_Element(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                ans[index++] = arr[i];
            }
        }
        ans[index++] = arr[n - 1]; // Add the last element

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = ans[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] duplicate = Remove_Duplicate_Element(arr);
        printArray(duplicate);
    }
}
