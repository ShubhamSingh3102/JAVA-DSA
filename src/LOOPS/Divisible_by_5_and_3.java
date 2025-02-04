package LOOPS;
import java.util.Scanner;
public class Divisible_by_5_and_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n % 5 ==0 && n % 3 ==0){
            System.out.println("Divisible by 5 and 3");
        }
        else{
            System.out.println("Not Divisible by 5 and 3");
        }
    }
}
