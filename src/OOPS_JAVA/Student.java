package OOPS_JAVA;

public class Student {
    public String name;
    //        private int roll_Number;// roll_Number has private access in OOPS_JAV.Student
    private int roll_Number;
    //        private double percentage;// cannot be access outside the class...
    double percentage;
    final String School_Name = "SJCHSS"; // cannot be changed because it is final....
    static int number_of_Students;


    public Student(){ //default constructor

    }

    public Student(String name, int roll_Number, double percentage){ // constructor for object creation
        this.name = name;
        this.roll_Number = roll_Number;
        this.percentage = percentage;
        number_of_Students++;
    }
    public int getroll_Number() { //getter
        return roll_Number;
    }
    //        public void setroll_Number(int roll) { //setter
//            roll_Number = roll;
//        }
    public void setroll_Number(int roll_Number) {
        this.roll_Number = roll_Number;
    }
}
