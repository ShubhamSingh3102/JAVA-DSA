package Patterns_Problems;
import java.util.Scanner;
public class Ult_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=r+1-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
