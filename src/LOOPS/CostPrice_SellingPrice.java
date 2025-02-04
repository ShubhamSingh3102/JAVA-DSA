package LOOPS;
import java.util.Scanner;
public class CostPrice_SellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        double CostPrice = sc.nextDouble();
        System.out.print("Enter the selling price: ");
        double SellingPrice = sc.nextDouble();
        double loss,profit;
        if(CostPrice > SellingPrice){
            loss = CostPrice - SellingPrice;
            System.out.println("The loss is: "+loss);
        }
        else if(CostPrice < SellingPrice){
            profit = SellingPrice - CostPrice;
            System.out.println("The profit is: "+profit);
        }
        else{
            System.out.println("Neither profit nor loss");
        }
    }
}
