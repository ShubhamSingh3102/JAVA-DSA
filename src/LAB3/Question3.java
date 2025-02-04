package LAB3;
import java.util.Scanner;
public class Question3 {
    static class Student {
        // Data members
        private int roll;
        private String name;
        private double cgpa;

        // Constructor
        public Student(int roll, String name, double cgpa) {
            this.roll = roll;
            this.name = name;
            this.cgpa = cgpa;
        }

        // Getter for CGPA
        // get returns the value of variable name...
        public double getCgpa() {
            return cgpa;
        }

        // Getter for Name
        public String getName() {
            return name;
        }

        // Method to display student details
        public void display() {
            System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of students: ");
            int n = sc.nextInt();

            // Array to store Student objects
            Student[] students = new Student[n];

            // Input details for each student
            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for student " + (i + 1) + ":");

                System.out.print("Roll: ");
                int roll = sc.nextInt();

                System.out.print("Name: ");
                sc.nextLine(); // Consume the newline
                String name = sc.nextLine();

                System.out.print("CGPA: ");
                double cgpa = sc.nextDouble();

                students[i] = new Student(roll, name, cgpa);
            }

            // Display all student details
            System.out.println("\nStudent Details:");
            for (Student student : students) {
                student.display();
            }

            // Find and display the student with the lowest CGPA
            Student lowest_Cgpa_Student= students[0];
            for (int i = 1; i < n; i++) {
                if (students[i].getCgpa() < lowest_Cgpa_Student.getCgpa()) {
                    lowest_Cgpa_Student = students[i];
                }
            }

            System.out.println("\nStudent with the lowest CGPA:");
            lowest_Cgpa_Student.display();

            sc.close();
        }
    }
