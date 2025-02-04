package LAB6;

    interface Motor {
        int capacity = 10;
        void run();
        void consume();
    }

    // Define the WashingMachine class implementing the Motor interface
    class WashingMachine implements Motor {

        @Override
        public void run() {
            System.out.println("Washing machine is running.");
        }

        @Override
        public void consume() {
            System.out.println("Washing machine is consuming power.");
        }

        // Method to display the capacity
        public void displayCapacity() {
            System.out.println("Capacity: " + capacity + " liters");
        }
    }

    // Driver class
    public class Question2 {
        public static void main(String[] args) {

            WashingMachine wm = new WashingMachine();

            wm.run();
            wm.consume();
            wm.displayCapacity();
        }
    }
