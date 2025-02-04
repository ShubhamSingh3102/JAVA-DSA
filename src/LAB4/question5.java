package LAB4;

public class question5 {
    static class FinalVariableDemo {
    // Declare final variables
    final String panCard = "ABCDE1234F";
    final String aadharCard = "123456789012";

    public void tryToChangeFinalValues() {
        // Uncommenting the following lines will cause compilation errors
        // panCard = "XYZ12345P";
        // aadharCard = "987654321098";

        System.out.println("PAN Card: " + panCard);
        System.out.println("Aadhar Card: " + aadharCard);
    }

    public static void main(String[] args) {
        FinalVariableDemo demo = new FinalVariableDemo();
        demo.tryToChangeFinalValues();
    }
}
}
