package com.list;
import java.util.*;
public class ArrayList_iterator {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(7);
        num.add(6);
        num.add(9);
        System.out.println("List : "+num);
        //iterator
        Iterator<Integer> i = num.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}
