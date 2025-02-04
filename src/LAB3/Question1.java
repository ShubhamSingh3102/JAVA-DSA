package LAB3;
import java.util.Scanner;
public class Question1 {
    static class Box {
        // Data members
        private double length;
        private double width;
        private double height;

        // Constructor
        public Box(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }
        // Method to calculate volume
        public double volume() {
            return length * width * height;
        }
    }
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

            // User input for dimensions
            System.out.print("Enter the length of the box: ");
            double length = sc.nextDouble();

            System.out.print("Enter the width of the box: ");
            double width = sc.nextDouble();

            System.out.print("Enter the height of the box: ");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);

            // Calculate and print the volume.....
            double volume = box.volume();
            System.out.println("The volume of the box is: " + volume);
        }
    }
