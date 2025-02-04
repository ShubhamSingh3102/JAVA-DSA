package LAB6;
import java.util.Scanner;
    // Define the Employee interface
    interface Employee {
        void getDetails(int empId, String empName);
    }

    // Define the Manager interface that extends Employee
    interface Manager1 extends Employee {
        void getDeptDetails(int deptId, String deptName);
    }

    // Define the Head class that implements the Manager interface
    class Head implements Manager1 {
        private int empId;
        private String empName;
        private int deptId;
        private String deptName;

        // Implement the getDetails method from Employee interface
        public void getDetails(int empId, String empName) {
            this.empId = empId;
            this.empName = empName;
        }

        // Implement the getDeptDetails method from Manager interface
        public void getDeptDetails(int deptId, String deptName) {
            this.deptId = deptId;
            this.deptName = deptName;
        }

        // for displaying...
        public void displayDetails() {
            System.out.println("Employee id - " + empId);
            System.out.println("Employee name - " + empName);
            System.out.println("Department id - " + deptId);
            System.out.println("Department name - " + deptName);
        }
    }

    public class Question4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input employee details
            System.out.print("Enter employee id: ");
            int empId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter employee name: ");
            String empName = scanner.nextLine();

            // Input department details
            System.out.print("Enter department id: ");
            int deptId = scanner.nextInt();
            scanner.nextLine(); //

            System.out.print("Enter department name: ");
            String deptName = scanner.nextLine();

            Head head = new Head();

            head.getDetails(empId, empName);
            head.getDeptDetails(deptId, deptName);

            head.displayDetails();

            scanner.close();
        }
    }