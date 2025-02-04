package LAB5Q;
import java.util.Scanner;
public class PlasticCostCalculator {
    // Base class for 2D shapes
    static class TwoDShape {
        double length;
        double width;

        // Constructor for 2D shape
        public TwoDShape(double length, double width) {
            this.length = length;
            this.width = width;
        }
        // Method to calculate the area of the 2D sheet
        public double calculateArea() {
            return length * width;
        }
        // Method to calculate the cost of the 2D sheet
        public double calculateCost() {
            return calculateArea() * 40; // Cost per square ft is Rs 40
        }
    }
    // Derived class for 3D shapes
    static class ThreeDBox extends TwoDShape {
        double height;

        // Constructor for 3D box
        public ThreeDBox (double length, double width, double height) {
            super(length, width); // extended class ka length and breadth leke yaha aao....
            this.height = height;
        }

        // Method to calculate the volume of the 3D box
        public double calculateVolume() {
            return length * width * height;
        }

        // Method to calculate the cost of the 3D box
        @Override
        public double calculateCost() {
            return calculateVolume() * 60; // Cost per cubic ft is Rs 60
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose the type of plastic:");
            System.out.println("1. 2D Sheet");
            System.out.println("2. 3D Box");
            int choice = sc.nextInt();

            if (choice == 1) {
                // Get dimensions for the 2D sheet
                System.out.println("Enter the length of the sheet (in ft):");
                double length = sc.nextDouble();

                System.out.println("Enter the width of the sheet (in ft):");
                double width = sc.nextDouble();

                // Create a 2D shape object and calculate cost
                TwoDShape sheet = new TwoDShape(length, width);
                System.out.printf("The cost of the 2D sheet is: Rs %.2f%n", sheet.calculateCost());

            } else if (choice == 2) {
                // Get dimensions for the 3D box
                System.out.println("Enter the length of the box (in ft):");
                double length = sc.nextDouble();

                System.out.println("Enter the width of the box (in ft):");
                double width = sc.nextDouble();

                System.out.println("Enter the height of the box (in ft):");
                double height = sc.nextDouble();

                // Create a 3D box object and calculate cost
                ThreeDBox box = new ThreeDBox(length, width, height);
                System.out.printf("The cost of the 3D box is: Rs %.2f%n", box.calculateCost());

            } else {
                System.out.println("Invalid choice! Please select either 1 or 2.");
            }
            sc.close();
        }
    }




