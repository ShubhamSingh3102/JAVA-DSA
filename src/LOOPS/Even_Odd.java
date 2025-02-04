package LOOPS;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if(number % 2 ==0){
            System.out.println("The number is an Even Number");
        }
        else{
            System.out.println("The number is a Odd Number");
        }
    }
}
