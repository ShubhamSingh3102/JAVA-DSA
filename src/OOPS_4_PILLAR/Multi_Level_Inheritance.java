package OOPS_4_PILLAR;
import java.util.Scanner;
public class Multi_Level_Inheritance {
    public static class Shape{
        public void area(){
            System.out.println("Display Area");
        }
    }
    public static class Triangle extends Single_Level_Inheritance.Shape {
        public void area(int h , int b){
            System.out.println(1/2*h*b);
        }
    }
    public static class EquilateralTriangle extends Triangle{
        public void area(int h , int b){
            System.out.println(1/2*b*h);
        }
    }
    public static void main(String[] args) {
        Single_Level_Inheritance.Triangle t = new Single_Level_Inheritance.Triangle();
        t.area();
    }
}
