package OOPS_4_PILLAR;
import java.util.Scanner;
public class Polymorphism {
    public static class Student {
        String name;
        int age;

        public void printInfo(String name) {
            System.out.println(name);
        }

        public void printInfo(int age) {
            System.out.println(age);
        }

        public void printInfo(String name, int age) {
            System.out.println(name + " " + age);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shubham";
        s1.age = 18;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
