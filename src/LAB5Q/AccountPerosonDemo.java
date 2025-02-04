package LAB5Q;
import java.util.Scanner;
public class AccountPerosonDemo{

    // Base class: Account
    static class Account {
        protected int acc_no;
        protected double balance;

        // Method to take input for Account
        public void input() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Account Number: ");
            acc_no = sc.nextInt();

            System.out.print("Enter Account Balance: ");
            balance = sc.nextDouble();
        }

        // Method to display Account details
        public void display() {
            System.out.println("Account Number: " + acc_no);
            System.out.println("Account Balance: Rs " + balance);
        }
    }

    // Subclass: Person
    static class Person extends Account {
        private String name;
        private String aadhar_no;

        // Method to take input for Person
        @Override
        public void input() {
            Scanner sc = new Scanner(System.in);

            super.input(); // Call the input method of Account

            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter Aadhar Number: ");
            aadhar_no = sc.nextLine();
        }

        // Overridden method to display Person details
        @Override
        public void display() {
            super.display(); // Call the disp method of Account
            System.out.println("Name: " + name);
            System.out.println("Aadhar Number: " + aadhar_no);
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Array to store details of three persons
            Person[] persons = new Person[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Person " + (i + 1) + ":");
                persons[i] = new Person();
                persons[i].input();
            }

            System.out.println("\nDetails of all persons:");
            for (int i = 0; i < 3; i++) {
                System.out.println("\nPerson " + (i + 1) + ":");
                persons[i].display();
            }
        }
    }
