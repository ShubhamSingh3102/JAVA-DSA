package LOOPS;
import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number = sc.nextInt();
        if(Number >99 && Number <1000){
            System.out.println("Three digit number");
        }
        else{
            System.out.println("Not a three digit number");
        }
    }
}
