package Conversion_problem;
import java.util.Scanner;
public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number");
        int binary_No = sc.nextInt();

        int ans = 0; //converted decimal number
        int pw = 1; //2^0=1 power of 2

        while(binary_No > 0){
            int unit_digit = binary_No % 10;
            ans = ans + (unit_digit * pw);
            binary_No = binary_No / 10;
            pw = pw*2;
        }
        System.out.println(ans);
    }
}
