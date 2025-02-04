package LOOPS;
import java.util.Scanner;
public class Sides_Of_Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of a triangle: ");
        int firstSide = sc.nextInt();
        System.out.print("Enter the second side of a triangle: ");
        int secondSide = sc.nextInt();
        System.out.print("Enter the third side of a triangle: ");
        int thirdSide = sc.nextInt();
        if(firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            System.out.println("They can be sides of the triangle");
        }
        else{
            System.out.println("They can't be sides of the triangle");
        }
    }
}
