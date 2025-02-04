package LAB3;
import java.util.Scanner;
public class Question5 {
    static class AreaCalculator {

        // Method to calculate the area of a circle
        public double area(double radius) {
            double pi = 3.14;
            return pi * radius * radius;
        }

        // Method to calculate the area of a triangle
        public double area(double base, double height) {
            return 0.5 * base * height;
        }

        // Method to calculate the area of a square
        public double area(int side) {
            return side * side;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            AreaCalculator calculator = new AreaCalculator();

            System.out.println("Choose an option to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    System.out.println("The area of the circle is: " + calculator.area(radius));
                    break;

                case 2:
                    System.out.print("Enter the base of the triangle: ");
                    double base = sc.nextDouble();

                    System.out.print("Enter the height of the triangle: ");
                    double height = sc.nextDouble();

                    System.out.println("The area of the triangle is: " + calculator.area(base, height));
                    break;

                case 3:
                    System.out.print("Enter the side of the square: ");
                    int side = sc.nextInt();
                    System.out.println("The area of the square is: " + calculator.area(side));
                    break;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }
}
