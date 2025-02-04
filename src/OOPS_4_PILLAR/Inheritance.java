package OOPS_4_PILLAR;
public class Inheritance {
    public static class Shape{
        String color;
    }
    public class Triangle extends Shape{
        // Inheritance syntax....
    }
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.color = "red";
        System.out.println(s1.color);
    }
}
