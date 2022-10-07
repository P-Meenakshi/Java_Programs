package com.list;

import java.util.ArrayList;

public class ArrayList_Enhanced_for {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(7);
        num.add(6);
        num.add(9);
        for (Integer i : num) {
            System.out.println(i);
        }
    }
}
