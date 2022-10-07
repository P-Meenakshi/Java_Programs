package com.list;
import java.util.*;
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(7);
        num.add(6);
        num.add(9);
        System.out.println(num);
        System.out.println(num.get(2));
        Collections.sort(num);
        System.out.println("After sorting \n"+num);
        Collections.sort(num,Collections.reverseOrder());
        System.out.println("Reverse order\n"+num);
        Collections.shuffle(num);
        System.out.println("Shuffling\n"+num);

    }
}
