package LAB5Q;
import java.util.Scanner;
public class MultiLevelInheritanceDemo {
    // Base class: Plate
    static class Plate {
        double length;
        double width;

        // Constructor for Plate
        public Plate(double length, double width) {
            this.length = length;
            this.width = width;
            System.out.println("Plate constructor called.");
            System.out.println("Dimensions: Length = " + length + ", Width = " + width);
        }
    }

    // Derived class: Box
    static class Box extends Plate {
        double height;

        // Constructor for Box
        public Box(double length, double width, double height) {
            super(length, width); // Call the constructor of Plate
            this.height = height;
            System.out.println("Box constructor called.");
            System.out.println("Dimensions: Length = " + length + ", Width = " + width + ", Height = " + height);
        }
    }

    // Derived class: WoodBox
    static class WoodBox extends Box {
        double thickness;

        // Constructor for WoodBox
        public WoodBox(double length, double width, double height, double thickness) {
            super(length, width, height); // Call the constructor of Box
            this.thickness = thickness;
            System.out.println("WoodBox constructor called.");
            System.out.println("Dimensions: Length = " + length + ", Width = " + width + ", Height = " + height + ", Thickness = " + thickness);
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get dimensions for WoodBox
            System.out.println("Enter the length of the WoodBox:");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of the WoodBox:");
            double width = scanner.nextDouble();

            System.out.println("Enter the height of the WoodBox:");
            double height = scanner.nextDouble();

            System.out.println("Enter the thickness of the WoodBox:");
            double thickness = scanner.nextDouble();

            // Create a WoodBox object, which will call constructors in the inheritance hierarchy
            WoodBox woodBox = new WoodBox(length, width, height, thickness);

            scanner.close();
        }
    }
