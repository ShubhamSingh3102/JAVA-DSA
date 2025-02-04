package OOPS_JAVA;
import static java.lang.Math.abs;

public class Fraction_Class {
    public static Fraction add(Fraction f1, Fraction f2) {
        int numerator = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int denominator = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(numerator, denominator);//by using constructor...
        return f3;
    }
    public static Fraction multiply(Fraction f1, Fraction f2) {
        int numerator = f1.numerator * f2.numerator;
        int denominator = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(numerator, denominator);//by using constructor...
        return f3;
    }
    public static Fraction sub(Fraction f1, Fraction f2) {
        int numerator = abs(f1.numerator * f2.denominator - f1.denominator * f2.numerator);
        int denominator = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    public static Fraction divide(Fraction f1, Fraction f2) {
        int numerator = f1.numerator * f2.denominator;
        int denominator = f1.denominator * f2.numerator;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    public static int gcd(int numerator, int denominator) {
        int min = Math.min(numerator, denominator);
        for (int i = min; i >= 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                return i;
            }
        }
        return min;
    }
    public static class Fraction {
        int numerator;
        int denominator;

        public Fraction(int numerator, int denominator) { //creation of constructor
            this.numerator = numerator;
            this.denominator = denominator;
            Simplify();
        }
        public void Simplify() {
//            if(numerator<denominator){
//                if(denominator % numerator == 0){
//                    denominator = denominator / numerator;
//                    numerator = 1;
            int hcf = gcd(numerator, denominator);
            numerator /= hcf;
            denominator /= hcf;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(35, 21);
        System.out.println(f1.numerator + "/" + f1.denominator);
//                f1.Simplify();
//                System.out.println(f1.numerator + "/" + f1.denominator);


        Fraction f2 = new Fraction(7, 3);
        System.out.println(f2.numerator + "/" + f2.denominator);
//                f2.Simplify();
//                System.out.println(f2.numerator + "/" + f2.denominator);
        //adding two fraction
        Fraction f3 = add(f1,f2);
        System.out.println("Sum is = "+f3.numerator + "/" + f3.denominator);
        Fraction f4 = multiply(f1,f2);
        System.out.println("Multiplication is = "+f4.numerator + "/" + f4.denominator);
        Fraction f5 = sub(f1,f2);
        System.out.println("Subtraction is = "+f5.numerator + "/" + f5.denominator);
        Fraction f6 = divide(f1,f2);
        System.out.println("Divide is = "+f6.numerator + "/" + f6.denominator);
    }
}
