package LAB4;
public class Counter2 {
        static int counter = 0;
        Counter2(){
            counter++;
        }
        public static void main(String[] args) {
            Counter2 c1 = new Counter2();
            Counter2 c2 = new Counter2();
            Counter2 c3 = new Counter2();
            Counter2 c4 = new Counter2();
            System.out.println(counter);
        }
    }