package problems_on_loops;
import java.util.Scanner;
public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int OriginalNumber = num;
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = num/ 10;
        }
        System.out.println("The sum of the digits is: " +sum);
    }
}
