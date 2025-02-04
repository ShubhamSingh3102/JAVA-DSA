package Basic_of_Java;
import java.util.Scanner;
public class Sum_of_TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of second number: ");
        double b = sc.nextDouble();
        double sum = a+b;
        System.out.println("The sum of two numbers are: "+sum);
    }
}
