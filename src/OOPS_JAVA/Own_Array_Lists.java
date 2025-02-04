package OOPS_JAVA;

import java.util.Arrays;

public class Own_Array_Lists {
    public static class ArrayList {
        int[] arr = new int[3];
        int idx = 0;
        int size = 0;
        public void add(int element) {
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length*2);
//                arr = new int[brr.length];
//                arr = Arrays.copyOf(brr, brr.length);
                arr = brr;
            }
            arr[idx] = element;
            idx++;
            size++;
        }
    }
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.size);
        arr.add(5);
        System.out.println(arr.size);
        System.out.println();
    }
}
