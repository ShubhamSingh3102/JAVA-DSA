package LAB6;
import java.util.Scanner;
    interface FinancialOperations {
        double earnings(double basic);
        double deductions(double basic);
        double bonus(double basic);
    }

    // Define the Manager class that implements FinancialOperations without the bonus() method
    class Manager implements FinancialOperations {
        @Override
        public double earnings(double basic) {
            return basic + (0.8 * basic) + (0.15 * basic); // Basic + DA (80%) + HRA (15%)
        }

        @Override
        public double deductions(double basic) {
            return 0.12 * basic; // PF 12% of basic
        }

        public double bonus(double basic) {
            throw new UnsupportedOperationException("Bonus method is not implemented.");
        }
    }

    // Define the Substaff class that extends Manager and implements the bonus() method
    class Substaff extends Manager {
        @Override
        public double bonus(double basic) {
            return 0.5 * basic; // Bonus 50% of basic
        }
    }

// Driver class

    public class Question3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input basic salary
            System.out.print("Enter basic salary: ");
            double basic = scanner.nextDouble();

            // Create an object of Substaff
            Substaff substaff = new Substaff();

            // Calculate earnings, deductions, and bonus
            double earnings = substaff.earnings(basic);
            double deductions = substaff.deductions(basic);
            double bonus = substaff.bonus(basic);

            // Display results
            System.out.println("Earnings: " + earnings);
            System.out.println("Deduction: " + deductions);
            System.out.println("Bonus: " + bonus);

            scanner.close();
        }
    }