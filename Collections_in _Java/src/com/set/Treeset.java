package com.set;
import java.util.*;


public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(22);
        ts.add(9);
        ts.add(10);
        ts.add(17);
        System.out.println(ts);
        for (Integer x : ts) {
            System.out.print(x + " ");
        }}
}
