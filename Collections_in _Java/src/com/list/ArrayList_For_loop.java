package com.list;
import java.util.*;

public class ArrayList_For_loop {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(7);
        num.add(6);
        num.add(9);
        for(int i=0;i<num.size();i++)
        {
            System.out.println(num.get(i));
        }
    }
}
