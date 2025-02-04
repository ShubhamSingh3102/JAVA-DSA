package LAB3;
import java.util.Scanner;
public class Question2 {
    static class Rectangle {
        // Data members
        private double length;
        private double breadth;

        // Method to read the values of length and breadth.....
        public void read() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the length of the rectangle: ");
            length = sc.nextDouble();

            System.out.print("Enter the breadth of the rectangle: ");
            breadth = sc.nextDouble();
        }

        // Method to calculate the area of the rectangle.....
        public double calculateArea() {
            return length * breadth;
        }

        // Method to calculate the perimeter of the rectangle....
        public double calculatePerimeter() {
            return 2 * (length + breadth);
        }

        // Method to display the results.....
        public void display() {
            double area = calculateArea();
            double perimeter = calculatePerimeter();

            System.out.println("The area of the rectangle is: " + area);
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
    }
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();

            rectangle.read();
            rectangle.display();
        }
    }

