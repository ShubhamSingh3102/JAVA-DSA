package OOPS_JAVA;
import java.util.Scanner;
public class Student_Class {
    //creating a new data type
//    public static class Student{
//        String name;
//        int roll_Number;
//        double percentage;
//    }
    public static void fun(Student x){
        System.out.println(x.name);
//        System.out.println(x.roll_Number);
        System.out.println(x.getroll_Number());
        System.out.println(x.percentage);//because it is private....
        System.out.println(x.School_Name);
//        System.out.println(x.number_of_Students);
    }
    public static void fun1(Student y){
        System.out.println(y.name);
        System.out.println(y.getroll_Number());
        System.out.println(y.percentage);
        System.out.println(y.School_Name);
//        System.out.println(y.number_of_Students);
    }
    public static void main(String[] args) {

        Student x = new Student("Shubham",23051219,93);//declaration...making of daabba...
        System.out.println(x.number_of_Students);
//        x.School_Name = "DPS";// cannot be changed because it is final....
//        x.name = "Shubham";
//     x.roll_Number = 23051219;
//        x.percentage = 92.5;
//        x.setroll_Number((23051219));

        Student y = new Student("Suraj",2305173,91);
        System.out.println(y.number_of_Students);
//        y.name = "Suraj";
//    y.roll_Number = 2305173;
//        y.percentage = 90.8;
//        y.setroll_Number((2305173));

//        System.out.println(x.name);
//        System.out.println(x.roll_Number);
//        System.out.println(x.percentage);
//
//        System.out.println(y.name);
//        System.out.println(y.roll_Number);
//        System.out.println(y.percentage);
        fun(x);
        fun1(y);

    }
}
