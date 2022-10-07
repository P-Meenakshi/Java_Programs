package com.set;

import java.util.HashSet;

public class Hashset_ex {
    public static void main(String [] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("ABC");
        hs.add("DH");
        hs.add("GHJ");
        hs.add("RIUG");
        hs.add("EYFG");
        System.out.println(hs);
        for (String x:hs) {
            System.out.print(x+" ");}
    }
}
