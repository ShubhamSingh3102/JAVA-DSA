package OOPS_4_PILLAR;

public class Single_Level_Inheritance {
    public static class Shape{
        public void area(){
            System.out.println("Display Area");
        }
    }
    public static class Triangle extends Shape{
        public void area(int h , int b){
            System.out.println(1/2*h*b);
        }
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
    }
}
