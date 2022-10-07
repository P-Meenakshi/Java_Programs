package com.MapandHashmap;

import java.util.TreeMap;

public class Treemap {
    public static void main(String [] args){
        TreeMap<Integer, String> tm= new TreeMap<Integer,String>();
        tm.put(1,"AB");
        tm.put(2,"CD");
        tm.put(3,"EF");
        tm.put(4,"GH");
        System.out.println(tm);
    }
}
