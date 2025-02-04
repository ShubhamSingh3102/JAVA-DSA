package ARRAY;
import java.util.Scanner;
public class Search_Element_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        int ans = -1;
        System.out.println("Enter the elements of the array");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == x){
                ans = i;
            }
        }
        System.out.println("The index of the element is: " + ans);
    }
}
