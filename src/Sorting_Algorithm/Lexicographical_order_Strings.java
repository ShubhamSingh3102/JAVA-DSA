package Sorting_Algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Lexicographical_order_Strings {
    static void sortFruits(String[] fruits) {
        int n = fruits.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(fruits[j].compareTo(fruits[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[minIndex];
            fruits[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] fruits = {"kiwi","apple","orange","banana", "papaya","mango"};
        sortFruits(fruits);
        System.out.println(Arrays.toString(fruits));
    }
}
