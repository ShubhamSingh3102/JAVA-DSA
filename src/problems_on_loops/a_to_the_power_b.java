package problems_on_loops;
import java.util.Scanner;
public class a_to_the_power_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int power = 1;
        for(int i=1;i<=b;i++){
            power = power * a;
        }
        System.out.println(power);
    }
}
