package OOPS_JAVA;

public class Pass_by_reference {
    public static class Student{
        String name;
        int age;
        int grade;
    }
    public static void change(Student s1){ // pass by reference...
        s1.name = "Shubham";
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 18;
        s1.grade = 90;
        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);
    }
}
