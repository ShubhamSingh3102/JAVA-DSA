package ARRAY;
import java.util.Scanner;
public class Number_of_Occurrence {
    static void countOccurrences(int[] arr, int x) {
        int count = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("Number of occurence of " +x+ " is " +count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        countOccurrences(arr,5);
    }
}
