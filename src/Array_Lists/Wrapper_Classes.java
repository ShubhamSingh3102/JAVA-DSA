package Array_Lists;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
public class Wrapper_Classes {
    public static void main(String[] args) {
        // wrapper classes

//        Integer i = Integer.valueOf(4); // objects and classes....
//        System.out.println(i);
//
//        Float f = Float.valueOf(4.5f); // objects and classes....
//        System.out.println(f);


        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Float> l2 = new ArrayList<>();
//        ArrayList<Double> l3 = new ArrayList<>();

        // adding new element....
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);


        // printing the array list directly....
        System.out.println(l1);

        // printing the size of the array list...
        System.out.println("Size of arrayList is : " + l1.size());


        // get(access) an element at index i.....
        System.out.println(l1.get(1));
        System.out.println(l1.get(3));


        // print with for loop.....
        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        // adding element at some index i-----> [5 100 6 7 8]
        l1.add(1,100);
        System.out.println(l1);

        // modifying element at index i....
        l1.set(1,10);
        System.out.println(l1); // [5,10,6,7,8]


        // removing an element at index i.....
        l1.remove(1);
        System.out.println(l1);

        // removing an element e (if index is not given).....
        l1.remove(Integer.valueOf(7));
//        System.out.println(l1.remove(Integer.valueOf(17)));
        System.out.println(l1);



        // checking if an element exists or not.....
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // if you don't specify wrapped class, you can put anything inside l......
        ArrayList l = new ArrayList();
        l.add("shubham");
        l.add(18);
        l.add(true);
        System.out.println(l);
    }
}
