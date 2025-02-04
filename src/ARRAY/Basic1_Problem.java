package ARRAY;

import java.util.Scanner;

public class Basic1_Problem {
    static void PrintArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void changeVal(int [] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    static void see(int a){
        a = 1000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =5;
        see(a);
        System.out.println(a);
        int [] arr = new int[3];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 6;

        // changeVal(arr); ---> shallow copy
        changeVal(arr.clone()); // deep copy
        PrintArray(arr);
        see(a);
    }
}
