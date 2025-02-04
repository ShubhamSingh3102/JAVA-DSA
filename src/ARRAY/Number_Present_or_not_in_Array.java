package ARRAY;
import java.util.Scanner;
public class Number_Present_or_not_in_Array {
    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    // q times puchenge ki number array me present h ya nhi...

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of queries");
        int q = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freqArr = makeFrequencyArray(arr);

        while(q>0){
            System.out.println("Enter the element to be searched: ");
            int ele = sc.nextInt();
            if(freqArr[ele]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }
}
