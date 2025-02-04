package LAB5Q;

public class DynamicMethodDispatchDemo {
    static class Apple {
        // Method to be overridden in derived classes
        public void show() {
            System.out.println("This is Apple class..");
        }
    }

    static class Banana extends Apple {
        // Overriding the show method
        @Override
        public void show() {
            System.out.println("This is Banana class..");
        }
    }

    static class Cherry extends Apple {
        // Overriding the show method
        @Override
        public void show() {
            System.out.println("This is Cherry class..");
        }
    }

        public static void main(String[] args) {
            // Creating references of the base class

            // Assigning an Apple object to the reference
            Apple appleRef = new Apple();
            appleRef.show(); // Calls show() of Apple

            // Assigning a Banana object to the reference
            appleRef = new Banana();
            appleRef.show(); // Calls show() of Banana

            // Assigning a Cherry object to the reference
            appleRef = new Cherry();
            appleRef.show(); // Calls show() of Cherry
        }
    }
