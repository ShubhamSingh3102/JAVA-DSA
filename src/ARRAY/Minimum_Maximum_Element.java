package ARRAY;
import java.util.Scanner;
public class Minimum_Maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = arr[0];
        int max = arr[0];
        System.out.println("Enter the element: ");
        for(int i = 0;i < arr.length;i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
        System.out.println("Maximum element is: " + max);
    }
}
