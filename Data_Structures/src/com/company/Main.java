package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> num = new ArrayList<>();
        //Insertion
        num.add(2);
        num.add(1);
        num.add(7);
        num.add(6);
        num.add(9);
        System.out.println(num);
        //searching
        System.out.println(num.get(2));
        //updating
        num.set(0,5);
        System.out.println(num);
        //deletion
        num.remove(3);
        System.out.println(num);
        System.out.println(num.size());
        //sorting
        Collections.sort(num);
        System.out.println("Sorted array"+ num);
        //for loop
        for(i=0;i<num.size();i++)
        {
            System.out.println(num.get(i));
        }

    }
}
