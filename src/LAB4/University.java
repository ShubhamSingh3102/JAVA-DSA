package LAB4;
import java.util.Scanner;
public class University {
        static String college = "KIIT";

        static void change(){
            college = "KIIT UNIVERSITY";
        }
        void display(){
            System.out.println(college);
        }
    public static void main(String[] args) {
        change();
        University u = new University();
        u.display();
    }
}
