package ARRAY;

import java.util.Scanner;
public class Basics_Problem_By_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = 4;
        arr[1] = 6;
        arr[2] = 7;

        //for loop
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //for each....partial array cannot be printed here....full array is printed
//        for(int age:arr){
//            System.out.println(age);
//        }

        //while loop
        int i=0;
        while(i<arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }
}
