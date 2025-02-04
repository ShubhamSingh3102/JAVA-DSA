package ARRAY;
import java.util.Scanner;
public class Second_Maximum_Element {
    static int maximum_value(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
//        System.out.println("Maximum value is " + max);
        return max;
    }
    static int Second_Maximum_Element(int[] arr){
        int max = maximum_value(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int second_max = maximum_value(arr);
        System.out.println("Second Maximum value is " + second_max);
        return second_max;
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
        Second_Maximum_Element(arr);
    }
}
