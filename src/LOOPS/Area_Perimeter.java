package LOOPS;
import java.util.Scanner;
public class Area_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        if(area > perimeter){
            System.out.println("Area of the rectangle is greater than it's perimeter");
        }
        else if(perimeter > area){
            System.out.println("Area of the rectangle is less than it's perimeter");
        }
        else{
            System.out.println("Area of the rectangle is equal to it's perimeter");
        }
    }
}
