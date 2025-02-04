package ARRAY;
import java.util.Scanner;
public class Swapping_two_number {
    // without using third variable
    static void Swapping_two_number(int a , int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapping two numbers without using third variable:");
        System.out.println(a);
        System.out.println(b);
    }
    static void Swapping_two_number_with_thirdVariable(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swapping two numbers with using third variable:");
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        Swapping_two_number(a,b);
        Swapping_two_number_with_thirdVariable(a,b);
    }
}
