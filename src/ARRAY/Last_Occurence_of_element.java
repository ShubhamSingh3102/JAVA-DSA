package ARRAY;
import java.util.Scanner;
public class Last_Occurence_of_element {
    static void countlastOccurence(int [] arr,int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        System.out.println("Index of an element " + x + " that occurs at last is:"+ lastIndex);
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
        countlastOccurence(arr,5);
    }
}
