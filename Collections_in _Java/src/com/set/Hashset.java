package com.set;
import java.util.*;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(22);
        hs.add(9);
        hs.add(10);
        hs.add(17);
        System.out.println(hs);
        for (Integer x:hs) {
            System.out.print(x+" ");}
        Iterator<Integer> i = hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
