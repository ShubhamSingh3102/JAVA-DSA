package ARRAY;

import java.util.Scanner;
public class Basic_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        ages[0] = 34;
        ages[1] = 18;
        ages[2] = 22;

        Scanner sc1 = new Scanner(System.in);
        float[] arr = new float[3];

        Scanner sc2 = new Scanner(System.in);
        String[] names = {"Shubham","Rahul","Suraj"};

        arr[0] = 3;
        arr[1] = 6;
        arr[2] = 7;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
