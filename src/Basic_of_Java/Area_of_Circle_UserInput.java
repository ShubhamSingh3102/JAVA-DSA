package Basic_of_Java;
import java.util.Scanner;
public class Area_of_Circle_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = sc.nextDouble();
        double pi = 3.1415926;
        double area = pi*radius*radius;
        System.out.println("The area of the circle is "+area);
    }
}
