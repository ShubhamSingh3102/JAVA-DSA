package LAB6;
import java.util.*;

    // In General Package
    class Employee1 {
        protected int empId;
        private String empName;

        public void setDetails(int empId, String empName) {
            this.empId = empId;
            this.empName = empName;
        }

        public double earnings(double basic) {
            return basic + (0.8 * basic) + (0.15 * basic); // Basic + DA (80%) + HRA (15%)
        }

        // for getting employee1
        public int getEmpId() {
            return empId;
        }
    }

    // In marketing package
     class Sales extends Employee1 {
        public double tAllowance(double earnings) {
            return 0.05 * earnings; // Travelling Allowance 5% of total earnings
        }

        public double totalEarnings(double basic) {
            double totalEarnings = earnings(basic);
            return totalEarnings + tAllowance(totalEarnings);
        }
    }

        public class Question5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input employee details
            System.out.print("Enter the employee id: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the employee name: ");
            String empName = scanner.nextLine();

            System.out.print("Enter the basic salary: ");
            double basic = scanner.nextDouble();

            // Create a Sales object
            Sales salesPerson = new Sales();
            salesPerson.setDetails(empId, empName);

            // Calculate total earnings
            double totalEarnings = salesPerson.totalEarnings(basic);

            // Display details
            System.out.println("The emp id of the employee is " + salesPerson.getEmpId());
            System.out.println("The total earning is " + totalEarnings);

            scanner.close();
        }
    }
