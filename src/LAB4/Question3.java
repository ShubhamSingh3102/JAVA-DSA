package LAB4;

public class Question3 {
    static class Box{
        private double length;
        private double breadth;
        private double height;

        public Box(){
            length = 0;
            breadth = 0;
            height = 0;
        }
        public Box(double length, double breadth, double height) {
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }
        void displayBox(){
            System.out.println("Length: " + length + " Breadth: " + breadth + " Height: " + height);
        }
    }
    public static void main(String[] args) {
        Box b1 = new Box(2.0,3.0,4.0);
        Box b2 = new Box(5.0,6.0,7.0);
        Box b3 = new Box();
        Box b4 = new Box();
        b1.displayBox();
        b2.displayBox();
        b3.displayBox();
        b4.displayBox();
    }
}
