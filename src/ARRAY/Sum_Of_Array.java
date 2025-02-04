package ARRAY;
import java.util.Scanner;
public class Sum_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter the elements of the array");
        for(int i =0; i<arr.length ;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("The sum of the elements of the array is: " + sum);
    }
}
