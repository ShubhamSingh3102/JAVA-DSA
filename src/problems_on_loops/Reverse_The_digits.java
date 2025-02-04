package problems_on_loops;
import java.util.Scanner;
public class Reverse_The_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int reverse = 0;
        while(n>0){
            int a = n % 10;
            n = n/10;
            reverse = reverse * 10 +a;
        }
        System.out.println("Reverse of a digit is "+reverse);
    }
}
