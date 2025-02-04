package problems_on_loops;
import java.util.Scanner;
public class n_Factorial_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
            System.out.println("Fcatorial of "+i+" is:"+fact);
        }
    }
}
