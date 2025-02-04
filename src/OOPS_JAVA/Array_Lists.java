package OOPS_JAVA;
import java.util.*;
public class Array_Lists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        System.out.println(arr.size());
        System.out.println(arr);
        arr.remove(4);
        System.out.println(arr);
        arr.set(1,3);
        System.out.println(arr);
//        Collections.sort(arr); // sorting
//        System.out.println(arr);
    }
}
