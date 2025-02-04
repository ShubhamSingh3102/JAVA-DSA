package LOOPS;
import java.util.Scanner;
public class Divisible_by_5_or_3_but_not_divisible_by_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n % 5 == 0 || n % 3 == 0) {
            if(n % 15 != 0){
                System.out.println("Divisible by 5 or 3 but not divisible by 15");
            }
            else{
                System.out.println("Divisible by 5 or 3 and divisible by 15 too");
            }
        }
        else{
            System.out.println("Neither divisible by 5 or 3");
        }
//        if(n % 15 != 0 && (n % 5 == 0 || n % 3 == 0)){
//            System.out.println("Divisible by 5 or 3 but not divisible by 15");
//        }
//        else{
//            System.out.println("Not matching our requirements");
//        }
    }
}
