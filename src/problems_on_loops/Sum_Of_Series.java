package problems_on_loops;
import java.util.Scanner;
public class Sum_Of_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter series of numbers: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum = sum - i;
            }
            else{
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
