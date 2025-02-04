package LAB4;

public class Question4 {
    static class Account {

        int account_no;
        String name;
        String branch;
        String bank_name;
        int balance;

        public Account(int a, String b, String c, String d, int e) {
            account_no = a;
            name = b;
            branch = c;
            bank_name = d;
            balance = e;
        }

        public void deposit(int value) {
            balance += value;
            System.out.println(value + " deposited. Bank balance: " + balance);
        }

        public void withdraw(int value) {
            if (balance >= value) {
                balance -= value;
                System.out.println(value + " withdrawn. Remaining balance: " + (balance));
            } else {
                System.out.println("Insufficient balance to withdraw this amount");
            }
        }

        public void display() {
            System.out.println("User Details: ");
            System.out.println("Name: " + name);
            System.out.println("Account No.: " + account_no);
            System.out.println("Bank Name: " + bank_name);
            System.out.println("Branch: " + branch);
            System.out.println("Bank Balance: " + balance);
        }

        public static void main(String[] args) {
            Account a = new Account(93189, "Arya Roy", "Jadavpur University", "SBI", 10000);
            a.display();
            System.out.println();
            a.deposit(1000);
            System.out.println();
            a.withdraw(5000);
            System.out.println();
            a.display();

        }
    }
}
