package LOOPS;

import java.util.Scanner;

public class Grade_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage scored by a student: ");
        double Percentage = sc.nextDouble();
        if(Percentage >=90 && Percentage <=100){
            System.out.println("Excellent");
        }
        else if(Percentage >=80 && Percentage <=90){
            System.out.println("Very Good");
        }
        else if(Percentage >=70 && Percentage <=80){
            System.out.println("Good");
        }
        else if(Percentage >=60 && Percentage <=70){
            System.out.println("Can do better");
        }
        else if(Percentage >=50 && Percentage <=60){
            System.out.println("Average");
        }
        else if(Percentage >=40 && Percentage <=50){
            System.out.println("Below Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}
