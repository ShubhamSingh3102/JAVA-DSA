package OOPS_4_PILLAR;

public class Static_Keyword {
    public static class Student{
        String name;
        static String school; // common for all the object....

        public static void changeSchool(){
            school = "DPS";
        }
    }
    public static void main(String[] args) {
        Student.school = "JVM"; // directly be accessable because it is class thing and not object things....
        Student student1 = new Student();
        student1.name = "Shubham";
//        student1.school = "SJCHHS"; // cannot be access through object....
        System.out.println(student1.name);
//       System.out.println(student1.school);
        System.out.println(student1.school);
    }
}
