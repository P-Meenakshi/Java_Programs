package com.set;
import java.util.*;
import java.util.HashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(2);
        ls.add(22);
        ls.add(9);
        ls.add(10);
        ls.add(17);
        System.out.println(ls);
        for (Integer x : ls) {
            System.out.print(x + " ");
        }
    }
}
