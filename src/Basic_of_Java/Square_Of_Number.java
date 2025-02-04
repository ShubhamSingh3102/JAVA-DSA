package Basic_of_Java;
import java.util.Scanner;
public class Square_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();
        double square = number * number;
        System.out.println("The square of " + number + " is " + square);
    }
}
