package LAB3;
import java.util.Scanner;
public class Question4 {
    static class Calculator {
        public int subtract(int a, int b) {
            return a - b;
        }

        // Method to subtract three integers
        public int subtract(int a, int b, int c) {
            return a - b - c;
        }

        // Method to subtract two double values
        public double subtract(double a, double b) {
            return a - b;
        }

        // Method to subtract an array of integers
        public int subtract(int[] numbers) {
            int result = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                result = result - numbers[i];
            }
            return result;
        }
    }
// Driver class to test the subtract methods
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using subtract with two integers
        System.out.println("Subtracting two integers: " + calculator.subtract(10, 5));

        // Using subtract with three integers
        System.out.println("Subtracting three integers: " + calculator.subtract(20, 5, 3));

        // Using subtract with two double values
        System.out.println("Subtracting two doubles: " + calculator.subtract(15.5, 4.2));

        // Using subtract with an array of integers
        int[] numbers = {50, 10, 5, 3};
        System.out.println("Subtracting an array of integers: " + calculator.subtract(numbers));
    }
}

