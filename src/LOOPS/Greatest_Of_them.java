package LOOPS;
import java.util.Scanner;
public class Greatest_Of_them {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.println("Greatest number is "+a);
        }
        else if(b > a && b > c){
            System.out.println("Greatest number is "+b);
        }
        else{
            System.out.println("Greatest number is "+c);
        }
    }
}
