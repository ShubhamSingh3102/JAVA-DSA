package Array_Lists;
import java.util.*;
import java.util.Collection;
import java.util.ArrayList;
public class Reverse_ArrayList {
//    static void reverseList(ArrayList<Integer> l1) {
//        int i = 0, j = l1.size() - 1;
//        while ( i < j){
//           // swapping arrayList....
//            Integer temp = Integer.valueOf(l1.get(i));
//            l1.set(i, l1.get(j));
//            l1.set(j, temp);
//            i++;
//            j--;
//        }
//    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(11);
        System.out.println("Original List: " + l1);
//        reverseList(l1);
        Collections.reverse(l1);
        Collections.sort(l1);
        System.out.println("Reversed List: " + l1);
        System.out.println("Ascending Order: " + l1);
        Collections.sort(l1, Collections.reverseOrder()); // custom comparator....
        System.out.println("Descending Order: " + l1);


        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Welcome");
        l2.add("To");
        l2.add("Physics");
        l2.add("Wallah");
        System.out.println("Original List: " + l2);
        Collections.sort(l2,Collections.reverseOrder());
        System.out.println("Sorted List: " + l2); //Lexicographical order.....


    }
}
