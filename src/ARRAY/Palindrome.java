package ARRAY;
import java.util.Scanner;
public class Palindrome {
    static boolean Palindrome(int x) {
        int rev = 0;
        int Original = x;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        if(rev == Original)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
       boolean res = Palindrome(n);
       System.out.println(res);
        }
    }
