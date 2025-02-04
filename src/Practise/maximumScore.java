package Practise;

import java.util.ArrayList;
import java.util.Scanner;
public class maximumScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        int maxScore = 0;
        int n = arr.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr.get(i) < arr.get(j)){
                    maxScore = Math.max(maxScore,arr.get(i)+arr.get(j));
                }
            }
        }
        System.out.println(maxScore);
    }
}