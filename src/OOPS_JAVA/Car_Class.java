package OOPS_JAVA;
import java.util.Scanner;
public class Car_Class {
    public static class Car{
        String name;
        String type;
        int price;
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Alto";
        c1.type = "hatchback";
        c1.price = 400000;

        Car c2 = new Car();
        c2.name = "Ferrari";
        c2.type = "luxury Sports car";
        c2.price = 110000000;

        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c1.type);
        System.out.println(c2.type);
        System.out.println(c1.price);
        System.out.println(c2.price);
    }
}
