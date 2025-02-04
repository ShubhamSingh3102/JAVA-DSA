package OOPS_4_PILLAR;
import java.util.Scanner;
public class Hybrid_Inheritance { // In this type of inheritance all different types of inheritance can be used....single or multi or hierarchical inheritance....
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
    public static class EquilateralTriangle extends Multi_Level_Inheritance.Triangle {
        public void area(int h , int b){
            System.out.println(1/2*b*h);
        }
    }
    public static class Circle extends Shape{
        public void area(int r){
            System.out.println(3.14*r*r);
        }
    }
    public static void main(String[] args) {
        Single_Level_Inheritance.Triangle t = new Single_Level_Inheritance.Triangle();
        t.area();
    }
}
