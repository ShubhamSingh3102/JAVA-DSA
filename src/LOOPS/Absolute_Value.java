package LOOPS;
import java.util.Scanner;
public class Absolute_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int a,b;
        if(number <= 0){
            a = -number;
            System.out.println("Absolute Value of number is: "+a);
        }
        else{
            b = number;
            System.out.println("Absolute Value of number is: "+b);
        }
    }
}
